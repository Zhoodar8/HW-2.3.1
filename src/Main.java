public class Main {

    public static void main(String[] args) {
        Bank client = new Bank(10000);
        while (true) {
            try {
                client.withDraw(3000);
                System.out.println("У вас осталось = " + client.getAmount());
            }catch (LimitException ok) {
                System.out.println("Ваш баланс :  " + client.getAmount());
                double amount = client.getAmount();
                if (client.getAmount() <= client.getSum())
                    amount = ok.getRemainingAmount() - ok.getRemainingAmount();
                System.out.println("Остаток баланса = " +  amount);
                break;
            }

        }
    }
}

public class Bank {

        private double amount;
        private double sum;

        public Bank(double amount) {
            this.amount = amount;
        }


        public double getAmount() {
            return amount;
        }


        public double getSum() {
            return sum;
        }

        public double withDraw(double sum) throws LimitException {
            amount = amount - sum;
            System.out.println("Cнято со счето  = " + sum);
            if (sum > amount) {
                throw new LimitException("У Вас недостаточно средств = ", getAmount());
            }
            return sum;
        }

        public void check() {
            LimitException limitException= new LimitException("Недостаточно средств = ", getAmount()) ;
            amount = limitException.getRemainingAmount() - limitException.getRemainingAmount();
            System.out.println("Сняли остаток " + amount);
        }
    }


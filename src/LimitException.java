public class LimitException extends Exception {

        private double remeiningAmount;

        public LimitException(String message, double remeiningAmount) {
            super(message);
            this.remeiningAmount = remeiningAmount;
        }

        public double getRemainingAmount() {
            return remeiningAmount;
        }
    }


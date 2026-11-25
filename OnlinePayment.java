class OnlinePayment {
    String paymentAmount = "2500";

    public static void main(String[] args) {
        OnlinePayment p = new OnlinePayment();

        try {
            double amount = Double.parseDouble(p.paymentAmount);
            System.out.println("Payment amount: " + amount);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid payment amount");
        }
    }
}
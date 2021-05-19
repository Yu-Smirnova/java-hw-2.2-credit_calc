public class Main {
    public static void main(String[] args) {
       CreditPaymentService service = new CreditPaymentService();

       int oneYearMonthPayment = service.calculate(1_000_000, 12);
        System.out.println(oneYearMonthPayment);

        int twoYearMonthPayment = service.calculate(1_000_000, 24);
        System.out.println(twoYearMonthPayment);

        int threeYearMonthPayment = service.calculate(1_000_000, 36);
        System.out.println(threeYearMonthPayment);
    }
}

public class CreditPaymentService {
    public int calculate(int loan, int period){
        double percent = 9.99;
        int monthPayment = (int) (loan * (percent/12/100 + (percent/12/100/(Math.pow((1+percent/12/100), period)-1))));
        return monthPayment;
    }
}

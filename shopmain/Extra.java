package shopmain;


public class Extra extends Discount {
    @Override
    public double calculateWithDiscount(double totalSum) {
        if (totalSum > 100_000) {
            return (totalSum * 0.03);
        } else if (totalSum > 150_000) {
            return (totalSum * 0.05);
        } else if (totalSum > 200_000) {
            return (totalSum * 0.07);
        }
        return 0;
    }
}

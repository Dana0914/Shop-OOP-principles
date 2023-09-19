package shopmain;


public class Special extends Discount {
    @Override
    public double calculateWithDiscount(double totalSum) {
        if (totalSum > 250_000) {
            return (totalSum * 0.06);
        }
        return 0;
    }
}

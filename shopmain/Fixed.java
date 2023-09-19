package shopmain;


public class Fixed extends Discount {
    @Override
    public double calculateWithDiscount(double totalSum) {
        return (totalSum * 0.04);

    }
}
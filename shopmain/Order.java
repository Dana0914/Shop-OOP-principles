package shopmain;


public class Order {
    private double price;
    private Discount[] discounts;

    public Order(double price, Discount[] discounts) {
        this.price = price;
        this.discounts = discounts;
    }
    public double getPrice() {
        return price;
    }

    public Discount[] getDiscounts() {
        return discounts;
    }

    public double getTotalWithDiscount() {
        double totalDiscount = 0;
        for (Discount discount : discounts) {
            totalDiscount += discount.calculateWithDiscount(price);

        }
        return price - totalDiscount;
    }
}

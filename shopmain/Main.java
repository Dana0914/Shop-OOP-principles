package shopmain;


public class Main {
    public static void main(String[] args) {
        Discount[] discounts = new Discount[]{new Fixed(), new Special(), new Extra()};

        Order o1 = new Order(120_000, discounts);
        Order o2 = new Order(225_000, discounts);
        Order o3 = new Order(276_000, discounts);
        Order o4 = new Order(700_000, discounts);

        Order[] orders = new Order[]{o1, o2, o3, o4};
        for (Order order : orders) {
            System.out.println(order.getTotalWithDiscount());
        }
    }
}

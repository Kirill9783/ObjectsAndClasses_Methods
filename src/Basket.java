public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static double totalCostAllBasket = 0;
    private static int totalItemsAllBascet = 0;
    private static double averagePriceItemsInAllBasket = 0;
    private static double averagePriceBasketToAllBascet = 0;

    public void increaseTotalCostAllBasket (int price, int count) {
        Basket.totalCostAllBasket = Basket.totalCostAllBasket + price * count;
    }

    public void increaseTotalItemsAllBasket(int count) {
        Basket.totalItemsAllBascet = Basket.totalItemsAllBascet + count;
    }

    public static double getTotalCostAllBasket() {
        return totalCostAllBasket;
    }

    public static int getTotalItemsAllBascet() {
        return totalItemsAllBascet;
    }

    public static double getAveragePriceItemsInAllBasket() {
        return totalCostAllBasket / totalItemsAllBascet;
    }

    public static double getAveragePriceBasketToAllBascet() {
        return getTotalCostAllBasket() / getCount();
    }

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int count, double weight) {

        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб." + " - " + weight + " кг";;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight * count;
        increaseTotalCostAllBasket(price, count);
        increaseTotalItemsAllBasket(count);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
        Basket.totalCostAllBasket = 0;
        Basket.totalItemsAllBascet = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

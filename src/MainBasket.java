public class MainBasket {

    public static void main(String[] args) {
        System.out.println("Задание 2");
        System.out.println("");

        Basket kirill = new Basket();
        kirill.add("Молоко", 40);
        kirill.add("Хлеб", 40, 2, 0.3);
        kirill.add("Кефир", 60, 3);
        kirill.print("Корзина Кирилла");
        System.out.println("Общий вес товаров: " + kirill.getTotalWeight() + " кг");
        System.out.println("Общая стоимость товаров: " + kirill.getTotalPrice() + " руб");

        System.out.println("");

        Basket misha = new Basket();
        misha.add("Пельмени", 100);
        misha.add("Йогурт", 15, 3, 0.1);
        misha.add("Рис", 90, 2);
        misha.add("Хлеб", 40, 3, 0.3);
        misha.print("Корзина Миши");
        System.out.println("Общий вес товаров: " + misha.getTotalWeight() + " кг");
        System.out.println("Общая стоимость товаров: " + misha.getTotalPrice() + " руб");

        System.out.println("");

        Basket masha = new Basket();
        masha.add("Кетчуп", 70, 1);
        masha.print("Корзина Маши");
        System.out.println("Общий вес товаров: " + masha.getTotalWeight() + " кг");
        System.out.println("Общия стоимость товаров: " + masha.getTotalPrice() + " руб");

        System.out.println("");

        System.out.println("Общая стоимость корзин: " +
                Basket.getTotalCostAllBasket());
        System.out.println("Общее количество позиций: " +
                Basket.getTotalItemsAllBascet());
        System.out.println("Средняя цена товара во всех корзинах: " +
                Basket.getAveragePriceItemsInAllBasket());
        System.out.println("Средняя стоимость всех корзин: " +
                Basket.getAveragePriceBasketToAllBascet());
    }
}






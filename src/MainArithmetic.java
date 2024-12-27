public class MainArithmetic {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Arithmetic task1 = new Arithmetic(6, 5);
        int sum = task1.sum();
        System.out.println("Сумма чисел: " + sum);
        int increase = task1.increase();
        System.out.println("Произведение чисел: " + increase);
        int maxNumber = task1.max();
        System.out.println("Максимальное число: " + maxNumber);
        int minNumber = task1.min();
        System.out.println("Минимальное число: " + minNumber);
    }
}

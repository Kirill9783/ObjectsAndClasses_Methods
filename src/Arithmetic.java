public class Arithmetic {
    public static int a;
    private static int b;

    public Arithmetic (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int increase() {
        return a * b;
    }

    public int max() {
        return a>=b ? a : b;
    }

    public int min() {
        return a<=b ? a : b;
    }
}

public class Fibonacci {
    private static int iter(int a, int b) {
        if (a < 1) {
            return b;
        }
        else {
            return iter(a - 1, a * b);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(iter(n, 1));
    }
}

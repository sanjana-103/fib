public class Fib {

    public void sum() {
        int n = 10;
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        fib.sum();
    }
}

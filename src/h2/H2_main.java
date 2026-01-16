package h2;

public class H2_main {



    private static long[] cache = new long[1000];

    public static void main(String[] args) {
        benchmark(10);
        benchmark(20);
        benchmark(30);
    }

    public static long fibonacci(int n) {
        if (n <= 0) throw new IllegalArgumentException("n muss >= 1 sein");
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciCached(int n) {
        if (n <= 0) throw new IllegalArgumentException("n muss >= 1 sein");
        if (n == 1 || n == 2) return 1;

        if (n < cache.length && cache[n] != 0) return cache[n];

        long result = fibonacciCached(n - 1) + fibonacciCached(n - 2);

        if (n < cache.length) cache[n] = result;

        return result;
    }

    public static long fibonacciIter(int n) {
        if (n <= 0) throw new IllegalArgumentException("n muss >= 1 sein");
        if (n == 1 || n == 2) return 1;

        long a = 1;
        long b = 1;

        for (int i = 3; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void benchmark(int n) {
        System.out.println("=== Benchmark fuer n = " + n + " ===");

        long start = System.nanoTime();
        long r1 = fibonacci(n);
        long end = System.nanoTime();
        System.out.println("fibonacci(" + n + ") = " + r1);
        System.out.println("Elapsed nanoseconds (fibonacci): " + (end - start));

        cache = new long[1000];
        start = System.nanoTime();
        long r2 = fibonacciCached(n);
        long end2 = System.nanoTime();
        System.out.println("fibonacciCached(" + n + ") = " + r2);
        System.out.println("Elapsed nanoseconds (fibonacciCached): " + (end2 - start));

        start = System.nanoTime();
        long r3 = fibonacciIter(n);
        long end3 = System.nanoTime();
        System.out.println("fibonacciIter(" + n + ") = " + r3);
        System.out.println("Elapsed nanoseconds (fibonacciIter): " + (end3 - start));

        System.out.println();
    }
}
	
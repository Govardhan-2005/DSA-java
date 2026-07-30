public class TimeComplexity {
    public static void main(String[] args) {
        // Example of O(n) time complexity
        int n = 1000;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Example of O(n^2) time complexity
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }

        // Example of O(log n) time complexity
        int x = 1024;
        while (x > 1) {
            x /= 2;
            System.out.println(x);
        }
    }
}
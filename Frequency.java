import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = new int[5];

            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                int count = 1;

                if (a[i] == -1)
                    continue;

                for (int j = i + 1; j < 5; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -1;
                    }
                }

                System.out.println(a[i] + " occurs " + count + " times");
            }
        }
    }
}
import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int second = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
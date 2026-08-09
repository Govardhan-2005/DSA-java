import java.util.*;

class MoveZeros {
    public static void main(String[] args) {
        int[] a = {0, 5, 0, 3, 8, 0, 2, 1};

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        while (index < a.length) {
            a[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
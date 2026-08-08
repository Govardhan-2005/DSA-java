import java.util.ArrayList;
import java.util.Scanner;

class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<String>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students.add(sc.nextLine());
        }

        System.out.println("\nStudent List:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.print("\nEnter name to search: ");
        String search = sc.nextLine();

        if (students.contains(search))
            System.out.println("Student Found");
        else
            System.out.println("Student Not Found");
    }
}

import java.util.Scanner;

class Person {
    String name;
    int age;
    int m1, m2, m3;

    void getPersonDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();

        sc.nextLine(); // buffer clear
    }

    double calAvg() {
        return (m1 + m2 + m3) / 3.0;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Marks: " + calAvg());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] students = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            students[i] = new Person();
            students[i].getPersonDetails(sc);
        }

        System.out.println("\n===== STUDENT DETAILS =====");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
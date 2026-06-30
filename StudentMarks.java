import java.util.Scanner;
import java.util.Arrays;

public class StudentMarks {

    public static void displayMenu() {
        System.out.println("===== Student Marks System =====");
        System.out.println("1. Enter Marks");
        System.out.println("2. Display Marks");
        System.out.println("3. Find Highest Mark");
        System.out.println("4. Find Lowest Mark");
        System.out.println("5. Calculate Average");
        System.out.println("6. Sort Marks");
        System.out.println("7. Search Mark");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        boolean entered = false;

        while (true) {

            displayMenu();
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter 5 student marks:");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.print("Mark " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    entered = true;
                    break;

                case 2:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                        break;
                    }

                    System.out.println("Student Marks:");
                    for (int mark : marks) {
                        System.out.print(mark + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                        break;
                    }

                    int highest = marks[0];
                    for (int mark : marks) {
                        if (mark > highest) {
                            highest = mark;
                        }
                    }
                    System.out.println("Highest Mark: " + highest);
                    break;

                case 4:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                        break;
                    }

                    int lowest = marks[0];
                    for (int mark : marks) {
                        if (mark < lowest) {
                            lowest = mark;
                        }
                    }
                    System.out.println("Lowest Mark: " + lowest);
                    break;

                case 5:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                        break;
                    }

                    int sum = 0;
                    for (int mark : marks) {
                        sum += mark;
                    }

                    double average = (double) sum / marks.length;
                    System.out.println("Average Marks: " + average);
                    break;

                case 6:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                        break;
                    }

                    Arrays.sort(marks);
                    System.out.println("Marks sorted successfully.");
                    break;

                case 7:
                    if (!entered) {
                        System.out.println("Please enter marks first.");
                        break;
                    }

                    System.out.print("Enter mark to search: ");
                    int target = sc.nextInt();

                    boolean found = false;

                    for (int mark : marks) {
                        if (mark == target) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Mark found.");
                    } else {
                        System.out.println("Mark not found.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();
        }
    }
}
System.out.println("Git is awesome!");
System.out.println("GitHub Test");
package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student>students= new ArrayList<>();

        System.out.println("Please enter number of students: ");
        int totalStudents = scan.nextInt();
        scan.nextLine();

        int count = 0;

        while (count<=totalStudents) {
            System.out.println("Please enter name of student: ");
            String name = scan.nextLine().trim();

            System.out.println("Please student email: ");
            String email = scan.nextLine().trim();

            System.out.println("Please enter course: ");
            String course= scan.nextLine().trim();

            Student student = new Student(name, email, course);

            students.add(student);

            count++;
        }

        System.out.println("Student list: ");

        for (Student student : students){
            System.out.println(student);
        }

    }
}

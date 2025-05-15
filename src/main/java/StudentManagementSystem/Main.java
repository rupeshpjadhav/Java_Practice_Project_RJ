package StudentManagementSystem;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Creating students
        Student s1 = new Student("Alice", 20, "S001");
        Student s2 = new Student("Bob", 22, "S002");
        Student s3 = new Student("Charlie", 19, "S003");

        // Enrolling courses
        s1.enrollCourse("Math");
        s1.enrollCourse("Science");

        s2.enrollCourse("English");
        s2.enrollCourse("History");

        s3.enrollCourse("Physics");
        s3.enrollCourse("Chemistry");

        // Adding students to the list
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Printing student info
        for (Student s : studentList) {
            s.printStudentInfo();
        }

        // Exception handling demo
        try {
            Student found = findStudentById(studentList, "S004");
            found.printStudentInfo();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // Bonus: Sorting students by name
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted Students by Name:");
        for (Student s : studentList) {
            s.printStudentInfo();
        }

        // Bonus: User input for new student and course enrollment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline
        System.out.print("Student ID: ");
        String id = scanner.nextLine();

        Student newStudent = new Student(name, age, id);
        studentList.add(newStudent);

        System.out.println("Enter courses for " + name + " (type 'done' to finish):");
        while (true) {
            System.out.print("Course: ");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("done")) break;
            newStudent.enrollCourse(course);
        }

        System.out.println("New student info:");
        newStudent.printStudentInfo();

        scanner.close();
    }

    public static Student findStudentById(List<Student> studentList, String studentId) {
        return studentList.stream()
                .filter(s -> s.getStudentId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Student with ID " + studentId + " not found."));
    }
}





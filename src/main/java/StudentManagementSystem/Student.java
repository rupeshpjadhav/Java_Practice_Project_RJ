package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
        private String name; //instance variables
        private int age;
        private String studentId;
        private List<String> courses;

        public Student(String name, int age, String studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            this.courses = new ArrayList<>();
        }

        public void enrollCourse(String course) {
            courses.add(course);
        }

        public void printStudentInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Student ID: " + studentId);
            System.out.println("Enrolled Courses: " + courses);
            System.out.println("------------------------");
        }

        public String getName() {
            return name;
        }

        public String getStudentId() {
            return studentId;
        }
    }



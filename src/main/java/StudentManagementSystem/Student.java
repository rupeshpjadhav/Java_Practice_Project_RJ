package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
        private String name; //instance variables
        private int age;
        private String studentId;
        private List<String> courses;

        public Student(String name, int age, String studentId) {
            if (validateName(name) && validateAge(age) && validateId(studentId)) {
                this.name = name;
                this.age = age;
                this.studentId = studentId;
                this.courses = new ArrayList<>();
            }

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

        public boolean validateName (String name) {
            String RegexName = "^[A-Za-z\\s]+$";
            Pattern p = Pattern.compile(RegexName);
            Matcher matcher = p.matcher(name);
            if (matcher.matches()) {
                return true;
            }
            else {
                System.err.println("Invalid Name : " +name);
                return false;
            }

        }

    public boolean validateId (String studentId) {
        String RegexName = "S-[0-9]+$";
        Pattern p = Pattern.compile(RegexName);
        Matcher matcher = p.matcher(studentId);
        if (matcher.matches()) {
            return true;
        }
        else {

            System.err.println("Invalid Student ID : " +studentId);
            return false;
        }


    }

    public boolean validateAge (int age) {
            if (age>=18 && age<=35) {
                return true;
            }
            else {
                System.out.println("Invalid Age : "+age);
                return false;
            }
    }


    }



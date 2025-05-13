package oops_practice.polymorphism;

public class Sanskriti extends School{

    public void mySchool() {
        System.out.println("This is Sanskriti school .... ");
    }

    public void schoolInfo () {
        System.out.println("Calling from Sanskriti school .....");
        System.out.println("School name is Sanskriti ");

    }

    public void schoolInfo (String name) {
        System.out.println("Calling from Sanskriti school .....");
        System.out.println("School name is "+name);

    }

    public void schoolInfo (String name, String city) {
        System.out.println("Calling from Sanskriti school .....");
        System.out.println("School name is "+name);
        System.out.println("City name is "+city);


    }

}

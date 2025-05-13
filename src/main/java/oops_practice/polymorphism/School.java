package oops_practice.polymorphism;

public class School {

    private String name;
    private String city;

    public void schoolInfo () {
        System.out.println("Generic School Info ");

    }

    public void schoolInfo (String name) {
        this.name = name;
        System.out.println("School name is "+this.name);

    }

    public void schoolInfo (String name, String city) {
        this.name = name;
        this.city = city;
        System.out.println("School name is "+this.name);
        System.out.println("City name is "+this.city);

        // all above methods are overloaded and they are checked at compile time
        // this is compile time polymorphism

    }
}

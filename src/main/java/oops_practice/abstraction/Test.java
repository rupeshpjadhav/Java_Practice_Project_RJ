package oops_practice.abstraction;

public class Test {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.runs();
        d.eats();
       // d.sleeps();

        String name1 = AnimalInterface.name; // called the constants
        System.out.println(name1 + " Called from Animal interface");
        int maxAge = AnimalInterface.maxAge;
        System.out.println("Max age is " +maxAge);


        AnimalInterface.animalInfo("Dog"); // called static method

        Cat c = new Cat();
        c.sleeps();
        c.eats();
        c.runs();
        c.run(); // called default method
        d.run();

        String name = Cat.name;
        System.out.println(name+" Called from Cat");
    }




}

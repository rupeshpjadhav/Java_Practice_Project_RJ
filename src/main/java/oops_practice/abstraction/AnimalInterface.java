package oops_practice.abstraction;

public interface AnimalInterface {
    String name = "Animal"; // constants
    int maxAge = 15; // constants

    void eats () ; //abstract method

    void runs (); //abstract method


    static void animalInfo (String name) {  // static method
        System.out.println("This is Animal interface created for "+name);
    }

    default void run() {    //default method
        this.runs();
        System.out.println("Called from Animal Interface ... ");
    }



}

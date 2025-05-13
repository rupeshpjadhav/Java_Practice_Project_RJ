package oops_practice.abstraction;

abstract class AbstractClassExample {

    int a; // instance variables
    int b;

    public AbstractClassExample(int a, int b) { //constuctor to initialize instance variables
        this.a = a;
        this.b = b;
    }

    public void info () { //method with body
        System.out.println("This is an inbuilt calculator");
        System.out.println("Sum of given values "+(a+b));
        System.out.println("Diff of given values "+(a-b));
        System.out.println("Multiplication of given values "+(a*b));
        System.out.println("Division of given values "+(a/b));
    }


    public abstract void add(int a, int b); // abstract methods without body
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);

    public abstract void div(int a, int b);


}

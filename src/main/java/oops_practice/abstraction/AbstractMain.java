package oops_practice.abstraction;

public class AbstractMain {

    public static void main(String[] args) {
       //AbstractClassExample ab = new AbstractClassExample();
        // AbstractClassExample' is abstract; cannot be instantiated
        AbstractClassExample ab = new AbstractExample(4,5);
        ab.info(); // this will use the above given inputs to calculate all
        ab.add(3,4); // this will use individual abstract methods to give result
        ab.sub(8,4);
        ab.mul(7,9);
        ab.div(9,3);
    }
}

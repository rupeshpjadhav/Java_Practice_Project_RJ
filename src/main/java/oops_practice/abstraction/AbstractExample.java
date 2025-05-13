package oops_practice.abstraction;

public class AbstractExample extends AbstractClassExample {
    public AbstractExample(int a, int b) {
        super(a, b);
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Sum is "+(a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Diff is "+(a-b));

    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication is "+(a*b));

    }

    @Override
    public void div(int a, int b) {
        System.out.println("Division is "+(a/b));
    }
}

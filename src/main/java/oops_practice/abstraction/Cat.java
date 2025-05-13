package oops_practice.abstraction;

public class Cat implements AnimalInterface,NewAnimalInterface{ // multiple inheritance
    @Override
    public void eats() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void runs() {
        System.out.println("Cat runs very fast");
    }

    @Override
    public void sleeps() {
        System.out.println("Cat sleeps a lot ZZZZZzzzzzz");
    }
}

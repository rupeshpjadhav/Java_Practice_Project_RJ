package oops_practice.inheritance;

public class Dog extends Animal{

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void eats () {
        System.out.println("Dog eats bones");
    }


    public void talks () {
        System.out.println("Dog barks");
    }



}

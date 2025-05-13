package oops_practice.inheritance;

public class Cat extends Animal{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void talks() {
        System.out.println("Cat Meows");
    }
}

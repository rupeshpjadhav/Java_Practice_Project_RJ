package oops_practice.inheritance;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eats () {
        System.out.println("Animal eats");
    }

    public void talks () {
        System.out.println("Animal talks");
    }
}

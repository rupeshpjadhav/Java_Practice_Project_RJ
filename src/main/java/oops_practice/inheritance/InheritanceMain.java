package oops_practice.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.setName("Tommy");
        d.eats();
        d.talks();
        System.out.println(d.getName());
        System.out.println("======================");

        Animal a = new Animal();
        a.setName("An Animal");
        System.out.println(a.getName());
        a.eats();
        a.talks();
        System.out.println("======================");

        Animal b = new Dog(); // even though animal reference is given
        b.setName("Sunny");  // even though parent method is called, at runtime it decides to call the overriden method of child
        b.eats();   // dynamic method dispatch..
        b.talks();
        System.out.println(b.getName());
        System.out.println("======================");

        Animal c = new Cat();
        c.setName("Tom");
        System.out.println(c.getName());
        c.talks();


        System.out.println("======================");
        animalTalks(b);
        animalTalks(c);
    }


    public static void animalTalks(Animal a) {   // here runtime polymorphism works
        a.talks();
    }
}

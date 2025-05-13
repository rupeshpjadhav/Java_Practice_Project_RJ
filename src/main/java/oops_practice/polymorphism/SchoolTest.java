package oops_practice.polymorphism;

public class SchoolTest {

    public static void main(String[] args) {

        School sc = new Sanskriti();
        // sc.myschool(); this does not work as the reference is of parent
        sc.schoolInfo();
        sc.schoolInfo("Abhinav");
        sc.schoolInfo("IIT","Mumbai");
        System.out.println("===============");

        //runtime polymorphism. Dynamic method dispatch
        // on runtime, overriden method runs
        // runtime polymorphism - method overriding


        Sanskriti sc2 = new Sanskriti();
        sc2.mySchool(); // now local method of child can be called as the reference is also of child
        sc2.schoolInfo();
        sc2.schoolInfo("Sanskriti Bhukum");
        sc2.schoolInfo("Sanskriti Bavdhan", "Pune");

        System.out.println("===============");
    }
}

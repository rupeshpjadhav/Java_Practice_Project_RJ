package oops_practice.encapsulation;

public class BankMain {

    public static void main(String[] args) {
        Bank bk = new Bank();
        bk.setName("HDFC");
        bk.setAddress("Pune");
        bk.setPincode(411021);
        System.out.println(bk.getName());
        System.out.println(bk.getAddress());
        System.out.println(bk.getPincode());


        NewBank nbk = new NewBank("Axis","Mumbai");
        System.out.println(nbk.getName());
        System.out.println(nbk.getBranch());

        nbk.setName("IDFC");
        nbk.setBranch("Delhi");
        System.out.println(nbk.getName());
        System.out.println(nbk.getBranch());



    }

}

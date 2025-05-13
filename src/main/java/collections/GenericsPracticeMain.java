package collections;

import java.util.ArrayList;

class newGeneric <T> implements Bank <T> {
    private T nameId;
    @Override
    public void setBank(T nameId) {
        this.nameId = nameId;
    }

    @Override
    public T getBank() {
        return this.nameId;
    }
}

class newKeyPair <K,V> implements KeyValuePairIn <K,V> {

    private K keyProp;
    private V valueProp;

    @Override
    public void setKeyProp(K keyProp) {
        this.keyProp = keyProp;
    }

    @Override
    public K getKeyProp() {
        return this.keyProp;
    }

    @Override
    public void setValProp(V ValProp) {
        this.valueProp = ValProp;

    }

    @Override
    public V getValProp() {
        return this.valueProp;
    }
}

public class GenericsPracticeMain {


    public static void main(String[] args) {
        //arraylist - heterogenous -- any datatype can be added

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add("hi");
        arr.add(true);
        arr.add(10.5);
        System.out.println("arr is " + arr);
        //String hi = arr.get(1); // cannot get as Required type:String and Provided:Object
        //int a = arr.get(0); // cannot get as Required type:int and Provided:Object
        int i1 = (Integer) arr.getFirst(); // casting needs to be done to get different datatypes
        System.out.println(i1);
        String hi = (String) arr.get(1); // casting needs to be done to get different datatypes
        System.out.println(hi);
        Double d = (Double) arr.getLast(); // casting needs to be done to get different datatypes
        System.out.println(d);

//        Above code has 3 major issues
//        No Type safety
//        Manual casting
//        No Compile Time checking - encounter the ClassCastException at runtime


        ArrayList<Integer> arrint = new ArrayList<>();   //arraylist - homogenous -- using generics
        arrint.add(1);
        //arrint.add("hi"); // cannot be added as not it has type safety, only int is allowed
        //arrint.add(true); // cannot be added as not it has type safety, only int is allowed
        //arrint.add(10.5); // cannot be added as not it has type safety, only int is allowed
        arrint.add(2);
        arrint.add(2, 5);
        System.out.println("arrint is " + arrint);

        //arrint.addAll(arr);
        System.out.println("arrint is " + arrint);

        for (int i : arrint) {
            System.out.println(i);
        }
        System.out.println("=================================");
        //calling the generic class by giving Integer as dataType
        GenericsExample<Integer> genInt = new GenericsExample<>();
        genInt.setValue(1);
        System.out.println("Here Integer is given as Type");
        System.out.println("genInt value is =====> " + genInt.getValue());

        //calling the generic class by giving String as dataType
        GenericsExample<String> genStr = new GenericsExample<>();
        genStr.setValue("Hello this is generics");
        System.out.println("Here String is given as Type");
        System.out.println("genStr value is ====> " + genStr.getValue());

        System.out.println("=================================");

        //Calling the pair class with parameters
        pair<Integer, String> p1 = new pair<>();
        p1.setKeyProp(1);
        p1.setValueProp("One");

        System.out.println("Output of pair p1 ====> " + "Key: " + p1.getKeyProp() + " " + "Value: " + p1.getValueProp());

        //Calling the pair class with parameters
        //We can create an object by giving any datatype for key and value as there is placeholder in the class
        pair<String, Integer> p2 = new pair<>();
        p2.setKeyProp("Two");
        p2.setValueProp(2);

        System.out.println("Output of pair p2 ====> " + "Key: " + p2.getKeyProp() + " " + "Value: " + p2.getValueProp());

        System.out.println("=================================");

        newGeneric<String> ng1 = new newGeneric<>();
        //same class implemented using generics. Object can be created for different data types as below
        ng1.setBank("HDFC");
        System.out.println("Bank name is ===> " +ng1.getBank());

        newGeneric<Integer> ng2 = new newGeneric<>();
        ng2.setBank(123456);
        System.out.println("Bank id is ===> " +ng2.getBank());
        System.out.println("=================================");


        newKeyPair<Integer,String> kp1 = new newKeyPair<>();
        kp1.setKeyProp(100);
        kp1.setValProp("One hundred");
        System.out.println("Key is =>> "+kp1.getKeyProp() + " and value is ==> " +kp1.getValProp());


        System.out.println("=================================");


        newKeyPair<String,String> kp2 = new newKeyPair<>();
        kp2.setKeyProp("Employee Name");
        kp2.setValProp("Rupesh");
        System.out.println("Key is =>> "+kp2.getKeyProp() + " and value is ==> " +kp2.getValProp());

        System.out.println("=================================");


        newKeyPair<String,Integer> kp3 = new newKeyPair<>();
        kp3.setKeyProp("Pincode");
        kp3.setValProp(411021);
        System.out.println("Key is =>> "+kp3.getKeyProp() + " and value is ==> " +kp3.getValProp());


    }
}


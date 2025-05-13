package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsPracticeMain {


    public static void main(String[] args) {
        //arraylist
        //arraylist - heterogenous -- any datatype can be added
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add("hi");
        arr.add("hello");
        arr.add(true);
        arr.add(false);
        arr.add(10.5);
        arr.add(11.5);
        System.out.println("arr is "+arr);
       // arr.remove(2);
        //arr.remove(3);
        //arr.removeLast();

        for (int i = arr.size()-1; i>=0; i-- ) {
            if (!(arr.get(i) instanceof Integer)) {
                System.out.println("removed  "+arr.get(i));
                arr.remove(i);
            }

        }

        System.out.println("final arr is "+arr);


        ArrayList <Integer> arrint = new ArrayList<>();   //arraylist - homogenous -- using generics
        arrint.add(1);
        //arrint.add("hi"); // cannot be added as not it has type safety, only int is allowed
        //arrint.add(true); // cannot be added as not it has type safety, only int is allowed
        //arrint.add(10.5); // cannot be added as not it has type safety, only int is allowed
        arrint.add(2);
        arrint.add(2,5);
        System.out.println("arrint is " +arrint);
        //arrint.addAll(arr);
        System.out.println("arrint is " +arrint);

        for (int i: arrint) {
            System.out.println(i);
        }

    }



}

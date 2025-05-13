package collections;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {


        Stack s = new Stack(); // LIFO -- FILO
        s.push(1);
        s.push("hi");
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.get(1));

        s.pop();
        System.out.println(s.peek());
        System.out.println(s); //[1, hi, 2]
        System.out.println((s.empty()));
        //s.clear();
        //System.out.println((s.empty()));

        int hi = s.search("hi"); // this will return considering the top on stack is at 1. So hi is at position 2
        System.out.println(hi);
        s.remove(hi-1); // here we need to consider the stack from 0 element, so we can reduce 1
        //s.remove("hi");

        System.out.println(s);


    }
}
package wrapper_classes;

public class wrapper {

    public static void main(String[] args) {


        int i = 1; // primitive type - stored in stack
        Integer i1 = 1; // The Integer class wraps a value of the primitive type int in an object... auto boxing
        //Integer i2 = Integer.valueOf(2); // unnecessary boxing .. you can directly give 1 .. Returns an Integer instance representing the specified int value
        Integer i2 = 2; // auto boxing
        //int i3 = i2.intValue();   //unnecessary unboxing ..Returns the value of this Integer as an int.
        int i3 = i2; //auto unboxing


        // to understand how references and values are stored
        Integer b = 1;    //
        fun(b); // output of this changed a not b
        System.out.println(b);  // What will it print and why?


        Student x = new Student();  //  reference to object is stored in x variable. x is some memory location address in stack
        x.id = 2;   // id of the object x is set to 2
        func(x); // x is passed to func. x is value of the reference of the object

        System.out.println(x.id);  // What will this print? 3 will be printed
    }

    static void fun(Integer a) {  // The reference b is copied and passed to a. so a is pointing to same object as b
        a = 2; // now a is pointing to new Integer object 2 but b is still same. hence b will return 1
    }


    static void func(Student a) {   // x is passed which is the value of the reference(mem address in stack)
    a.id = 3;     // both x and a point to same object, so changing the id of a will change the same object id
}



}



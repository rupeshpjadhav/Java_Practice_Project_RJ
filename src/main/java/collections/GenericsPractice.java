package collections;

import java.util.ArrayList;

class GenericsExample<T>  {
    //  These type parameters are placeholders that are replaced with specific types
    //  when the class is instantiated.
    //Here, GenericsExample<T> is a generic class. The type parameter T will be replaced with a specific type
    // when an object of GenericsExample is created. Now, the GenericsExample class is type-safe,
    // and we will not encounter the ClassCastException because the types are enforced at compile time.

    private T value; // Below is getter setter for private value variable of type T

    public void setValue (T value) {
        this.value = value;
    }

    public T getValue () {
        return this.value;
    }



}


class pair <K,V> {
    // Here, the Pair<K, V> class has two type parameters K and V,
    // and you can specify the types when you create an instance of Pair.
    private K keyProp;
    private V valueProp;
    public K getKeyProp() {
        return keyProp;
    }

    public void setKeyProp(K keyProp) {
        this.keyProp = keyProp;
    }


    public V getValueProp() {
        return valueProp;
    }

    public void setValueProp(V valueProp) {
        this.valueProp = valueProp;
    }


}


public class GenericsPractice {

    
    public static void test () {

        //
        
    }
}

package org.ie.practice;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        //without using generics
        List l = new ArrayList();
        l.add(3);
        l.add(2);
        l.add(3);
        int sum = 0;
        /* type cast is required because method returns
        Object type object. So programmer can't access particular object functionality
        without casting it.*/

        for (Object o : l
        )
            sum = sum + (Integer) o;

    /*The above problem can be solved by using generics.
     programmer can specify the type of object which is going to be stored
     in that collection.
     */

    List <Integer> l2= new ArrayList<>();
    l2.add(2);



}

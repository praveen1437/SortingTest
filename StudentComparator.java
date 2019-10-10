package org.ie.practice;

import java.util.Comparator;

public class StudentComparator implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Student s1=null;
        Student s2=null;
        if(o instanceof Student && t1 instanceof Student){
            s1=(Student)o;
            s2=(Student)t1;
            System.out.println(s1.getMarks());
            System.out.println(s2.getMarks());
        }
        if(s1.getMarks()>s2.getMarks()){
            return -1;
        }
       else if(s1.getMarks()<s2.getMarks()){
            return 1;
        }
       return 0;
    }
}

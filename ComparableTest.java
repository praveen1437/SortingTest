package org.ie.practice;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        Set ts= new TreeSet();
        List<Student> students= new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        Student s1= new Student();
        s1.setName("Naruto");
        s1.setCourse("ninja");
        s1.setMobileNo(999999);
        s1.setsId(1);
        s1.setMarks(100);

        Student s2= new Student();
        s2.setName("Bleach");
        s2.setCourse("ninja");
        s2.setMobileNo(999999);
        s2.setsId(2);
        s2.setMarks(98);

        Student s3= new Student();
        s3.setName("MY HERO ACADEMIA");
        s3.setCourse("Super Heroes");
        s3.setMobileNo(999999);
        s3.setsId(3);
        s3.setMarks(98);

        Student s4= new Student();
        s4.setName("Bleach");
        s4.setCourse("ninja");
        s4.setMobileNo(999999);
        s4.setsId(2);
        s4.setMarks(98);

        ts.add(s1);
        ts.add(s3);
        ts.add(s2);
        ts.add(s4);
       // System.out.println(ts.size());

      System.out.println(ts);
        //System.out.println(Integer.compare(s2.getsId(),s1.getsId()));
    }
}

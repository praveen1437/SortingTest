package org.ie.practice;

public class Student implements Comparable {
    private String name;
    private int sId;
    private String Course;
    private long mobileNo;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public int getsId() {
        return sId;
    }

    public String getCourse() {
        return Course;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    @Override
    public int compareTo(Object o) {
        Student s=null;
        if(o instanceof Student){
           s= (Student) o;
        }
        return Integer.compare(this.sId, s.sId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sId=" + sId +
                ", Course='" + Course + '\'' +
                ", mobileNo=" + mobileNo +
                ", marks=" + marks +
                '}'+"\n";
    }

    @Override
    public int hashCode() {
        return this.sId;
    }

    @Override
    public boolean equals(Object obj) {
        Student s=null;
        if(obj instanceof Student) s=(Student)obj;
        return this.sId==s.sId;
    }
}

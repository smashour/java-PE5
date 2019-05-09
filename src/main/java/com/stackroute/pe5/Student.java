package com.stackroute.pe5;

import java.lang.reflect.Array;
import java.util.*;

public class Student {
    private int id;
    private int age;
    private  String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
class StudentSorter implements Comparator<Student>{


    public int compare(Student s1, Student s2) {
        if(s1.getAge()==s2.getAge())
            return 0;
        else if(s1.getAge()>s2.getAge())
            return 1;
        else
            return -1;
    }

    }
class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class Maintest{
    public static void main(String[] args) {


        Student student1 = new Student(112, 11, "judy");
        Student student2 = new Student(110, 11, "Marvel");
        Student student3 = new Student(115, 12, "Rahel");
        Student student4 = new Student(114, 10, "Aadam");
        Student student5 = new Student(113, 13, "Lanter");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        



        System.out.println(list);
        Collections.sort(list, new StudentSorter());
        for (Student st : list) {
            System.out.println(st.getAge());
        }
        Collections.sort(list, new NameComparator());
        for (Student st : list) {
            System.out.println(st.getName());
        }

    }

    }

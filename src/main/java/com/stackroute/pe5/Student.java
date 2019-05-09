//Create a Student class that represents the following information of a student: id, name, and age
//all the member variables should be private .
//a. Implement `getter and setter` .
//b. Create a `StudentSorter` class that implements `Comparator interface` .
//c. Write a class `Maintest` create Student class object(minimum 5)
//d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having
//same age, sort based on their name.
//f. For students having same name and age, sort them according to their ID.



package com.stackroute.pe5;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.*;

public class Student {
    private String id;
    private int age;
    private  String name;

    public Student(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
//comparison based on age,name and ID
class StudentSorter implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() == o2.getAge())    //check wheather age is equal
        {
            if (o1.getName().equals(o2.getName()))    //check wheather name is equal
                return o1.getId().compareTo(o2.getId());  //comparing IDs
            else
                return o1.getName().compareTo(o2.getName()); //comparing names
        } else
            {
            return o2.getAge() - o1.getAge();   //comparing ages
        }
    }

    }


    class Maintest {
        public static void main(String[] args) {

            //creating object of Student
            Student student1 = new Student("112", 11, "Judy");
            Student student2 = new Student("111", 11, "Marvel");
            Student student3 = new Student("115", 12, "Rahel");
            Student student4 = new Student("114", 10, "Aadam");
            Student student5 = new Student("113", 13, "Lanter");


            //creating Arraylist
            ArrayList<Student> list = new ArrayList<Student>();
            list.add(student1);
            list.add(student2);
            list.add(student3);
            list.add(student4);
            list.add(student5);


            Iterator<Student> studentIterator = list.iterator();

            System.out.println("Before Sorting:\n");
            while (studentIterator.hasNext()) {
                Student student=(Student)studentIterator.next();
                System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
            }

            // sorting using Collections.sort(list, comparator);
            Collections.sort(list, new StudentSorter());

            // after Sorting arraylist: iterate using enhanced for-loop

            System.out.println(("\n\nThe sorted list is : \n"));
            for (int i = 0; i < list.size(); ++i) {

                PrintStream var1 = System.out;
                String var2 = ((Student) list.get(i)).getId();
                var1.println(var2 + " " + ((Student) list.get(i)).getName() + " " + ((Student) list.get(i)).getAge());

            }
        }

    }


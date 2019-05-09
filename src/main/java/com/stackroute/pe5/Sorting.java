//program to implement set interface which sorts the given randomly ordered names inascending order. Convert the sorted set in to an ​ array list


package com.stackroute.pe5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {

        System.out.println("enter limit"); //Enter number of names to enter
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        System.out.println("Enter names"); //enter names
        Set<String> names = new TreeSet<>(); //set list
        for(int i=0;i<limit;i++)
        {
            names.add(input.next());  //adding names to set
        }
        System.out.println("Sorted set"+names);

    }
}

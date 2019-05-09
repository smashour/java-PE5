//program to update specific array element by given element and empty the ​ array list​



package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdatingAndEmptyingArrayList {
    public static void main(String[] args) {

        //create an Arraylist object & initialising Arraylist
        ArrayList<String> fruits=new ArrayList<String>(Arrays.asList("Apple","Grape","Melon","Berry"));
        System.out.println(fruits);

        fruits.set(0,"Kiwi"); //replacing first element in string with Kiwi
        fruits.set(2,"Mango"); //replacing 3rd element with mango
        System.out.println(fruits);

        fruits.clear();
        System.out.println("Array list after removing all elements"+fruits);

    }
}

//a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//Modify and return the given map as follows:



package com.stackroute.pe5;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringMap {
    public static void main(String[] args) {
        Map<String,String> testMap=new TreeMap<String,String>(); //initialising map list
        System.out.println("enter values");
        Scanner input = new Scanner(System.in); //scanner
        String val1=input.next();
        String val2=input.next();
        testMap.put("value1",val1); //adding values to Map
        testMap.put("value2",val2);
        System.out.println(testMap);
        //swapping values
    if(testMap.size()>=2) {
        testMap.put("value2", testMap.get("value1"));
        testMap.put("value1", "");
        System.out.println(testMap);
    }
    }
}

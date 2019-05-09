//a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
//each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
//Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;

public class StringBoolean {
    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> myMap = new HashMap<String, Boolean>();
        for (String s : array) {

            boolean flag = myMap.containsKey(s); //to check wheather array contains more than one occurence of character
            myMap.put(s, flag);
        }
        System.out.println(myMap);
    }
}




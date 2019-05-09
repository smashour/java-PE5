//program to find the number of counts in the following ​ String​ . Store the output in
//Map<​ String​ ,Integer> as key value pair.
//Input : ​ String​ str = “one one -one___two,,three,one @three*one?two”;
//Output : {"one":5 , "two":2, "three" :2}



package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;

public class CountsInString {
    public static void main(String[] args) {
        String sentence = "one one -one___two,,three,one @three*one?two";// <--initialized statement
        String newsentence=sentence.replace("-"," ").replace("_"," ").replace("@"," ").replace(","," ").replace("*"," ").replace("?"," ");
        String[] s=new String[100];
        s=newsentence.split(" ");
        Map<String,Integer> testMap=new HashMap<String, Integer>();
        for (String i: s) {

            if (testMap.containsKey(i))
            {    //initial hash map is empty. character compared with elements inside the hash map
                testMap.put(i, testMap.get(i)+1);
            } else
                {
                    testMap.put(i,1);
            }
            testMap.remove("");
        }
        System.out.println(testMap);
    }
}

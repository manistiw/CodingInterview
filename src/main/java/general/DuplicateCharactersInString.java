package general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersInString {
    //Write a Java program to print duplicate characters in String
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sring: ");
        String str1=sc.nextLine();
        System.out.println("Getting duplicate character in string using Loops");
        printDuplicatesUsingLoops(str1);
        System.out.println("Getting duplicate character in string using Maps");
        printDuplicatesUsingMaps(str1);

    }

    public static void printDuplicatesUsingMaps(String str){
        Map<Character,Integer> maps=new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            if(maps.get(str.charAt(i))==null)
                maps.put(str.charAt(i),1);
            else
                maps.put(str.charAt(i),maps.get(str.charAt(i))+1);
        }
        for(Map.Entry<Character,Integer> entry:maps.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }

    public static void printDuplicatesUsingLoops(String str1){
        for(int i=0;i<str1.length();i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    System.out.println(str1.charAt(i));
                }
            }
        }

    }
}

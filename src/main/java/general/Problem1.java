package general;

import java.util.Scanner;

public class Problem1 {
    //Write a Java program to get the character at the given index within the String
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sring: ");
        String str1=sc.nextLine();
        System.out.println("Enter the index: ");
        Integer index=sc.nextInt();
        if(index>=0 && index<str1.length()){
            System.out.println("The character at index: "+index+" is: "+str1.charAt(index));
        }
        else{
            System.out.println("No Character found at the requested index: "+ index);
        }



    }
}

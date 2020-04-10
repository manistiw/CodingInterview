package general;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){



    }

    public static boolean isAnagram(String str1,String str2){
        String str1Normalized=str1.replaceAll("[\\s]","").toLowerCase();
        String str2Normalized=str2.replaceAll("[\\s]","").toLowerCase();
        StringBuilder strBr=new StringBuilder(str2Normalized);
        if(str1Normalized.length()!=str2Normalized.length()){
            return false;
        }
        for(int i=0;i<str1Normalized.length();i++){
            char ch=str1Normalized.charAt(i);
            int index= strBr.indexOf(String.valueOf(ch));
            if(index==-1){
                return false;
            }
            else {
                strBr.deleteCharAt(index);
            }
        }
        return strBr.length()==0? true:false;

    }


}

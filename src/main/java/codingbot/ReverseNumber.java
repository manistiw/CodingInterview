package codingbot;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+num%10;
            num=num/10;
        }
        System.out.println("reverse number is "+reverse);
    }

    public static int maxNum(int ...num){
        if(num.length==0)return Integer.MIN_VALUE;
        int m=num[0];
        for(int n: num){
            if(n>m){
                m=n;
            }
        }
        return m;
    }

}

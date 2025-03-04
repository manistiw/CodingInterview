package codingbot;
/*
Given 3 int values, a b c, return their sum. However,
if one of the values is the same as another of the values,
it does not count towards the sum.
 */

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if(a==b && b==c) return 0;
        int sum=a+b+c;
        if(a==b){
            sum=sum-(a+b);
        }
        if(a==c){
            sum=sum-(a+c);
        }
        if(b==c){
            sum=sum-(b+c);
        }
        return sum;
    }
}

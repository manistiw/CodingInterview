package codingbot;
/*
Given three ints, a b c,
return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.
 */

public class closeFar {
    public boolean closeFar(int a, int b, int c) {
        int diffB=Math.abs(b-a);
        int diffC=Math.abs(c-a);
        int diffCB=Math.abs(c-b);
        return (diffB<=1 && diffC>=2 && diffCB>=2) || (diffB>=2 && diffCB>=2 && diffC<=1)?true:false;
    }

}

package codingbot;
/*
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks
 */
public class makeBricks {
    public static void main(String args[]){
        //System.out.println(makeBricks(3,1,8));
        //System.out.println(makeBricks(3,1,9));
        System.out.println(makeBricks(3,2,9));

    }
    public static boolean makeBricks(int small, int big,int goal){
        return small>=goal-Math.min(big,goal/5)*5?true:false;
    }
}

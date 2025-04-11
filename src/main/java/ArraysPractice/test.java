package ArraysPractice;
/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class test {
    public int[] squareUp(int n) {
        int index=0;
        int nums[]=new int[n*n];
        for(int i=0;i<n;i++){
            int k=n;
            for(int j=0;j<n;j++){
                if(k<=(i+1)){
                    nums[index++]=k;
                }
                else{
                    nums[index++]=0;
                }
                k--;
            }
        }
        return nums;
    }
}

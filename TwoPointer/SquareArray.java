package TwoPointer;
import java.util.*;
public class SquareArray {

    public static int[] squareArray(int nums[]){
        int n = nums.length;
        int result[] = new int[n];
        int i=0, j=n-1, pos=n-1;
        while (i <= j) {
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];
            if(leftSquare > rightSquare){
                result[pos] = leftSquare;
                i++;
            } else {
                result[pos] = rightSquare;
                j--;
            }
            pos--;
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {-4,-1,0,3,10,12};
        System.out.println(Arrays.toString(squareArray(nums)));
    }
}

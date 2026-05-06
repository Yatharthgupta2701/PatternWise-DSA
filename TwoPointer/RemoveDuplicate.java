package TwoPointer;
public class RemoveDuplicate {

    public static int removeDuplicate(int nums[]){
        int i=0, j=1, count=1;
        while(j<nums.length){
            if(nums[j] == nums[i]){
                j++;
                continue;
            } else {
                nums[i+1] = nums[j];
                i++;
                count++;
                j++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));
    }
}

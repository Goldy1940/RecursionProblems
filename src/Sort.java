import java.util.*;
public class Sort {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,2};
        System.out.println(search(arr));
    }

    static int search(int[] nums)
    {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            if(nums[left]==nums[right])
                return nums[left];
            if(nums[left]<nums[right])
                left++;

        }
        return -1;
    }
}

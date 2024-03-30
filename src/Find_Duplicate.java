public class Find_Duplicate {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,4};
        //System.out.println(duplicate(arr));
        System.out.println(copy(arr));
    }
 //
    static int copy(int[] nums)
    {
        int slow=nums[0];
        slow=nums[slow];
        int fast=nums[0];
        fast=nums[nums[fast]];

        // detect cycle
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}

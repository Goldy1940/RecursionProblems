public class TargetSubset {
    public static void main(String[] args)
    {
      int[] array={10,20,30,40,50,60};
      printSubset(array,0,"",0,60);
    }
    public static void printSubset(int[] arr,int idx,String set,int sos,int target)
    {
        if(idx==arr.length)
        {
            if(sos==target)
            {
                System.out.println(set+"");
            }
            return;
        }
        printSubset(arr,idx+1,set+arr[idx]+"  ",sos+arr[idx],target);
        printSubset(arr,idx+1,set,sos,target);
    }
}

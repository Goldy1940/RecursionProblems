public class StrictlyPalindromic {
    public static void main(String[] args)
    {
        System.out.println(check(1000));
    }
    static boolean check(int n)
    {
        int copy=n;
        for(int i=2;i<=copy-2;i++)
        {
           String str="";
            int d=0;

             while(n>0)
             {
                 d=n%i;
                 str=str+Integer.toString(d);
                 n/=i;
             }
             if(isPalindrome(str))
             {
                 n=copy;
                 continue;

             }

             else return false;
        }
        return true;
    }
    static boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
       while(left<right)
       {
           if(str.charAt(left)!=str.charAt(right))
               return false;
       }
       return true;

    }
}

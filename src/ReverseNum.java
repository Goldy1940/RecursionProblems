public class ReverseNum {
    static int sum=0;
    public static void main(String[] args)
    {
        int n=123432;
        reverse(n);
        System.out.println(isPalindrome(n,sum));
    }
    static void reverse(int n)
    {
        if(n==0)
            return;
        int d=n%10;
        sum=sum*10+d;

        reverse(n/10);
    }
    static boolean isPalindrome(int n,int rev)
    {
        return n == rev;
    }
}

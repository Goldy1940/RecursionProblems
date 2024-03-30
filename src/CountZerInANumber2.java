public class CountZerInANumber2 {
    public static void main(String [] args)
    {
        int n=1200034098;
        System.out.println(helper(n));
    }
    static int helper(int n)
    {
       return count(n,0);
    }
    static int  count(int a,int c)
    {

        if(a==0)
            return c;
        int d=a%10;
        if(d==0)
            c++;
        return count(a/10,c);
    }
}

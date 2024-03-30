public class CountZeroInANumber {
    static int count=0;
    public static void main(String[] args)
    {
        countZero(1001);
       System.out.println(count);
    }
    static void countZero(int n)
    {
        int d=n%10;

        if(n==0)
            return;
        if(d==0)
            count++;
        countZero(n / 10);
    }
}

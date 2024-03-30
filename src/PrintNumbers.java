public class PrintNumbers {
    public static void main(String[] args)
    {
       funBoth(10);
    }
    static void count(int n)
    {

        System.out.println(n);

        if(n==1)
            return;

        count(n-1);


    }

    static void funBoth(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}

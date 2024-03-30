public class Stones {
    public static void main(String[] args)
    {
        String jewels="aaA";
        String sones="aabbggff";
        System.out.println(count(jewels,sones));
    }
    static int count(String jewels,String stones)
    {
        int c=0;

        for(int i=0;i<jewels.length();i++)

        {
            if(jewels.indexOf(stones.charAt(i))!=-1)
                c++;
        }
        return c;
    }
}

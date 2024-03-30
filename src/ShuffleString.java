public class ShuffleString {
    public static void main(String[] args)
    {
        String s="abcde";
        int[] indices={4,3,2,1,0};
        System.out.println(shuffle(s,indices));
    }
    static String shuffle(String s, int[] indices)
    {

        char[] ch=new char[s.length()];

        for(int i=0;i<indices.length;i++)
        {
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);


    }
}

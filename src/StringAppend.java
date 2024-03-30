public class StringAppend {
    public static String defangIPaddr(String address) {
        String str="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                str+="[.]";
            }
            else{
                str+=address.charAt(i);
            }
        }
        return str;
    }
    public static void main(String[] args)
    {
        System.out.println(usingStringBuilder("1.1.1.1"));
    }
    static String usingStringBuilder(String address)
    {
        StringBuilder ans = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                ans.append("[.]");
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}

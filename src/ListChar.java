import java.util.*;
public class ListChar {
    public static void main(String[] args)
    {
        String[] words={"ahsh","jjssddddddda","ajsh","gfrasd","ghgf"};
        char x='a';

        System.out.println(findWordsContaining(words,x));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List ans=new ArrayList(words.length);
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;i<words[i].length();j++)
            {
                if (words[i].charAt(j)==x)
                {
                    ans.add(i);
                    break;
                }

            }
        }
        return ans;
    }
}

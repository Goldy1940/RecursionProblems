public class ValidWords {
    public static void main (String[] args)
    {

    }
    static int count(String sentence)
    {
        int counter=0;
        int charcount=0;
        String[] word=sentence.split("");
        for( String c : word)
        {
            for(int i=0;i<c.length();i++)
            {
                if(c.charAt(i)>='0' || c.charAt(i)<='9')
                    break;
                else if(c.endsWith("-")|| c.startsWith("-") )
                    break;
                else if(c.charAt(i)>='A' || c.charAt(i)<='Z')
                    break;
                else if(charcount==2)
                    break;
                else if(c.charAt(i)=='-')
                {
                    if(c.charAt(i-1)>='a'|| c.charAt(i-1)<='z')
                    {
                        if(c.charAt(i+1)>='a'||c.charAt(i+1)<='z')
                            charcount++;
                    }

                }
                else counter++;

            }
        }
        return counter;
    }
}

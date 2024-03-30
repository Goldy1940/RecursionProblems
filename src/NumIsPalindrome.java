public class NumIsPalindrome {
    public static void main(String[] args)
    {
        int num=1234321;
        String word=Integer.toString(num);
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String word)
    {
        int left=0;
        int right=word.length()-1;
        String lower=word.toLowerCase();

        while(left<right)
        {
            if(lower.charAt(left)!= lower.charAt(right))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}

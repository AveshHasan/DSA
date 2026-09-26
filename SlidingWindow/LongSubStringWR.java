package SlidingWindow;
import java.util.HashSet;
public class LongSubStringWR {
    public static int longSubStr(String str)
    {
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxLen = 0;
        for(int right =0; right<str.length(); right++)
        {
            while(set.contains(str.charAt(right)))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longSubStr(str));
    }
}

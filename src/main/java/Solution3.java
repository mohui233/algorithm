/**
 * @author Wangzj
 * @date 2019/6/26 16:17
 */
public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        String[] a = new String[s.length()];
        char[] b = s.toCharArray();
        StringBuilder e = new StringBuilder();
        for (int i=0; i<b.length; i++){
            char f = b[i];
            String c = String.valueOf(f);
            String k = e.toString();
            if (s.contains(c)){
                e.append(c);
                System.out.println(k);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abbbcdbe");
    }
}
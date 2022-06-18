import java.util.*;

/**
 * 赎金信
 *
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 *
 * @author wangzhijie
 */
public class Solution383 {

    /**
     * 示例 1：
     *
     * 输入：ransomNote = "a", magazine = "b"
     * 输出：false
     *
     * 示例 2：
     *
     * 输入：ransomNote = "aa", magazine = "ab"
     * 输出：false
     *
     * 示例 3：
     *
     * 输入：ransomNote = "aa", magazine = "aab"
     * 输出：true
     *
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char key   = 'a' - 1;
        char end   = 'z';
        Map<Character, Integer>  map   = new HashMap(16);
        while (key < end) {
            key++;
            map.put(key, 0);
        }
        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value ++;
                map.put(c, value);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value --;
                map.put(c, value);
                if(value < 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String ransomNote  = "aab";
        String magazine = "baa";
        System.out.println(canConstruct2(ransomNote, magazine));
    }

}

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 *
 * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 *
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 *
 * @author wangzhijie
 */
public class Solution412 {

    /**
     * 示例 1：
     *
     * 输入：n = 3
     * 输出：["1","2","Fizz"]
     *
     * 示例 2：
     *
     * 输入：n = 5
     * 输出：["1","2","Fizz","4","Buzz"]
     *
     * 示例 3：
     *
     * 输入：n = 15
     * 输出：["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     *
     * 提示：
     *
     * 1 <= n <= 104
     *
     * @param n
     * @return
     */
    public static List<String> fizzBuzz2(int n) {
        List<String> fbList = new ArrayList<>();
        for (int i=1; i<=n; i++ ) {
            Integer num = Integer.valueOf(i).intValue();
            Boolean fizzBoolean = num % 3 == 0;
            Boolean buzzBoolean = num % 5 == 0;
            Boolean fizzBuzzBoolean = fizzBoolean && buzzBoolean;
            if (fizzBuzzBoolean) {
                fbList.add("FizzBuzz");
            } else if (buzzBoolean) {
                fbList.add("Buzz");
            } else if (fizzBoolean) {
                fbList.add("Fizz");
            } else {
                fbList.add(num.toString());
            }
        }
        return fbList;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            answer.add(sb.toString());
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        fizzBuzz2(16);
    }

}

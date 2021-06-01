/**
  * 题目Id：3
  * 题目：无重复字符的最长子串
  * 日期：2021-05-13 17:43:21
*/
//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 5451 👎 0

package leetcode.editor.cn;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        int result = solution.lengthOfLongestSubstring("abc");
        System.out.println("result:" + result);
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*int result = 0;
        String[] sStr = s.split("");
        int[] resultIndex = null;
        for(int i = 0; i < sStr.length; i++){
            for (int j = i + 1; j < sStr.length; j++){
                int n = 0;
                if(sStr[i].equals(sStr[j])){
                    if(result <= (j - i)){
                        result = j - i;
                        resultIndex = new int[]{i, j};
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(resultIndex));
        return result;*/
        HashSet<Character> hashSet = new HashSet<>();
        int rk = -1,ans = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(i != 0){
                hashSet.remove(s.charAt(i - 1));
            }
            while(rk + 1 < n && !hashSet.contains(s.charAt(rk + 1))){
                hashSet.add(s.charAt(rk + 1));
                ++ rk;
            }
            ans = Math.max(ans, rk + 1 - i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 
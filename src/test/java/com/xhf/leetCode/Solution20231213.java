package com.xhf.leetCode;

/**
 * @projectName: test
 * @package: com.xhf.leetCode
 * @className: Solution20231213
 * @descriptions:
 * @author: xiahaifeng
 * @createDate: 2023/12/13 13:37
 * @updateUser: xiahaifeng
 * @updateDate: 2023/12/13 13:37
 * @updateRemark:
 */

/**
 * 给你一个由 小写英文字母 组成的字符串 s ，你可以对其执行一些操作。在一步操作中，你可以用其他小写英文字母 替换  s 中的一个字符。
 * 请你执行 尽可能少的操作 ，使 s 变成一个 回文串 。如果执行 最少 操作次数的方案不止一种，则只需选取 字典序最小 的方案。
 * 对于两个长度相同的字符串 a 和 b ，在 a 和 b 出现不同的第一个位置，如果该位置上 a 中对应字母比 b 中对应字母在字母表中
 * 出现顺序更早，则认为 a 的字典序比 b 的字典序要小。 返回最终的回文字符串。
 */
public class Solution20231213 {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int mid = chars.length / 2;
        for(int i = 0; i < mid; i++){
            if(chars[i] != chars[chars.length - i - 1]){
                chars[i] = chars[chars.length - i - 1] = (char) Math.min(chars[i], chars[chars.length - i - 1]);
            }
        }
        return new String(chars);
    }
}

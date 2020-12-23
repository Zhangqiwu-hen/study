package j2se.leetcode;

import java.util.HashMap;

public class Question_387 {

    public int firstUniqChar(String s) {

//        /*方法一：用数组存储字母出现次数，遍历返回第一个出现次数为1的字母索引*/
//        int[] cishu = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            cishu[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (cishu[s.charAt(i) - 'a'] == 1) {
//                return i;
//            }
//        }
//        return -1;

//        /*方法二：HashMap存储字母及其出现次数，然后遍历*/
//        HashMap<Character,Integer> cishu = new HashMap<>();
//        for(int i=0; i<s.length(); ++i){
//            cishu.put(s.charAt(i),cishu.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(int i=0; i<s.length(); ++i){
//            if(cishu.get(s.charAt(i))==1)
//                return i;
//        }
//        return -1;

        /*方法三：*/
        for(int i=0; i<s.length(); ++i){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;

    }

}

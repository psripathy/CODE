package com.learn.slidingwindow;

import java.util.HashMap;

public class LongestSubStringWithKDistinctChars {
    public static void main(String[] args) {
        //max of 2 chars allowed in the str. for below input return 4(aaah)
        System.out.println(longestSubString("aaahhibc", 2));
    }

    static int longestSubString(String inputStr, int K){
        char [] inputChars = inputStr.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        int start = 0, currentSize = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int end=0;end<inputChars.length;end++){
            currentSize += charMap.entrySet().size();
            if(null == charMap.get(inputChars[end])){
                charMap.put(inputChars[end], 1);
            }else {
                charMap.put(inputChars[end], charMap.get(inputChars[end]).intValue()+1);
            }
            while(currentSize>K){
                charMap.put(inputChars[start], charMap.get(inputChars[start]).intValue()-1);
                if(charMap.get(inputChars[start]).intValue() == 0)
                    charMap.remove(inputChars[start]);
                start++;
            }
            maxLength = Math.max(maxLength, currentSize);
        }
        return maxLength;
    }
}

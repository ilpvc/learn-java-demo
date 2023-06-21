package com.example.demo;

/**
 * Description:
 *
 * @date:2023/6/17 17:07
 * @author: ilpvc
 */
public class Solution {

    private final String KISS = "I LOVE YOU";
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int headPoint = i;
            int footPoint = i;
            String tempResult = "";
            while (headPoint >= 0 && footPoint < s.length()) {
                if (headPoint == footPoint) {
                    tempResult = String.valueOf(charArray[i]);
                    footPoint++;
                } else if ((footPoint - headPoint) % 2 == 0) {
                    if (charArray[headPoint] == charArray[footPoint]) {
                        tempResult = charArray[headPoint] + tempResult +charArray[footPoint];
                        headPoint--;
                    }else {
                        break;
                    }

                    footPoint++;
                } else if ((footPoint - headPoint) % 2 == 1) {
                    if (charArray[headPoint] == charArray[footPoint]) {
                        tempResult = tempResult + charArray[footPoint];

                        footPoint++;
                    }

                    headPoint--;
                }
                if (tempResult.length() > result.length()) {
                    result = tempResult;
                }
            }
        }
        return result;
    }

    public String getString(Solution solution){
        return solution.KISS;
    }
}


package org.tiny.slidingwindow;

public class MaximizeTheConfusionOfAnExam {
    public static void main(String[] args) {
        int k;
        String case1 = "TTFF";
        k = 2;
        System.out.println(Solution.maxConsecutiveAnswers(case1, k));

        String case2 = "TFFT";
        k = 1;
        System.out.println(Solution.maxConsecutiveAnswers(case2, k));

        String case3 = "TTFTTFTT";
        k = 1;
        System.out.println(Solution.maxConsecutiveAnswers(case3, k));

        String case4 = "FFFTTFTTFT";
        k = 3;
        System.out.println(Solution.maxConsecutiveAnswers(case4, k));
    }
}

class Solution {
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        if (answerKey.length() < k) {
            return answerKey.length();
        }

        return Math.max(getMaxCharWindow(answerKey, k, 'F'), getMaxCharWindow(answerKey, k, 'T'));
    }

    public static int getMaxCharWindow(String answerKey, int k, char c) {
        int left = 0;
        int right = 0;
        int maxWindow = 0;
        int overflow = 0;
        while (right < answerKey.length()) {
            if (answerKey.charAt(right) != c) {
                overflow += 1;
                while (overflow > k) {
                    overflow -= answerKey.charAt(left) != c ? 1 : 0;
                    left++;
                    maxWindow = Math.max(right - left + 1, maxWindow);
                }
            }

            right++;
        }

        return Math.max(right - left, maxWindow);
    }
}
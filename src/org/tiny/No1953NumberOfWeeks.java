package org.tiny;

import java.util.Arrays;

public class No1953NumberOfWeeks {
    public static long numberOfWeeks(int[] milestones) {
        Arrays.sort(milestones);

        int length = milestones.length;
        int max = milestones[length - 1];
        long restSum = 0;
        for (int i = 0; i < length - 1; i++) {
            restSum += milestones[i];
        }
        if (restSum >= max) return restSum + max;

        return restSum * 2 + 1;
    }
}

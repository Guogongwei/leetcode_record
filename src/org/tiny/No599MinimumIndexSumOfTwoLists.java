package org.tiny;

import java.util.*;

public class No599MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }

        Map<String, Integer> listMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            listMap.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int min = 9999;
        for (int i = 0; i < list2.length; i++) {
            String key = list2[i];
            if (!listMap.containsKey(key)) {
                continue;
            }
            int sum = listMap.get(key) + i;
            if (sum < min) {
                min = sum;
                result.clear();
                result.add(key);
            } else if (sum == min) {
                result.add(key);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}

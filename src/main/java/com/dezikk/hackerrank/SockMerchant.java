package com.dezikk.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    static public int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i]) + 1);
                if (map.get(ar[i]) % 2 == 0) pairs++;
            } else {
                map.put(ar[i], 1);
            }
        }
        return pairs;
    }
}

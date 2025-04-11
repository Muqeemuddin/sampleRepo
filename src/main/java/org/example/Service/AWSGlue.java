package org.example.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AWSGlue {

//        public static void updateData(List<Integer> data, List<List<Integer>> query) {
//            Map<Integer, Integer> freqMap = new HashMap<>();
//            int sum = 0;
//
//            // Initialize frequency map and sum
//            for (int num : data) {
//                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//                sum += num;
//            }
//
//            // Process each query
//            for (List<Integer> q : query) {
//                int oldVal = q.get(0);
//                int newVal = q.get(1);
//
//                if (freqMap.containsKey(oldVal)) {
//                    int count = freqMap.get(oldVal);
//
//                    // Update sum
//                    sum += count * (newVal - oldVal);
//
//                    // Update frequency map
//                    freqMap.remove(oldVal);
//                    freqMap.put(newVal, freqMap.getOrDefault(newVal, 0) + count);
//                }
//
//                // Print sum after each query
//                System.out.println(sum);
//            }

    public static List<Integer> processQueries(int[] data, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> valueFrequency = new HashMap<>();
        int totalSum = 0;

        // Initialize frequency map and sum
        for (int num : data) {
            valueFrequency.put(num, valueFrequency.getOrDefault(num, 0) + 1);
            totalSum += num;
        }

        // Process each query
        for (int[] query : queries) {
            int oldValue = query[0];
            int newValue = query[1];

            if (valueFrequency.containsKey(oldValue)) {
                int count = valueFrequency.get(oldValue);
                totalSum += (newValue - oldValue) * count;

                // Update the frequency map
                valueFrequency.remove(oldValue);
                valueFrequency.put(newValue, valueFrequency.getOrDefault(newValue, 0) + count);
            }

            result.add(totalSum);
        }

        return result;

    }

//    public List<Integer> processQueries(int[] data, int[][] queries){
//        List<Integer> result = new ArrayList<>();
//        for(int i=0; i<data.length; i++){
//
//        }
//    }

}

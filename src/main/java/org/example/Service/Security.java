package org.example.Service;

import java.util.*;

public class Security {
//    private static final int MOD = 1_000_000_007;
//
//    public static int countSecuredStrings(String s, String t) {
//        int n = s.length();
//        Set<String> uniqueSubsequences = new HashSet<>();
//
//        // Generate all subsequences using bitmasking
//        for (int mask = 1; mask < (1 << n); mask++) {
//            StringBuilder subseq = new StringBuilder();
//
//            for (int i = 0; i < n; i++) {
//                if ((mask & (1 << i)) != 0) {
//                    subseq.append(s.charAt(i));
//                }
//            }
//
//            String subStr = subseq.toString();
//
//            // Store unique subsequences only
//            if (subStr.compareTo(t) > 0) {
//                uniqueSubsequences.add(subStr);
//            }
//        }
//
//        return uniqueSubsequences.size() % MOD;
//    }

//    private static final int MODULO = 1000000007;
//
//    // Function to generate all subsequences of a given string
//    public static void generateSubsequences(String s, int index, StringBuilder current, TreeSet<String> subsequences) {
//        if (index == s.length()) {
//            if (current.length() > 0) { // Exclude empty subsequence
//                subsequences.add(current.toString());
//            }
//            return;
//        }
//
//        // Include current character
//        current.append(s.charAt(index));
//        generateSubsequences(s, index + 1, current, subsequences);
//        current.deleteCharAt(current.length() - 1); // Backtrack
//
//        // Exclude current character
//        generateSubsequences(s, index + 1, current, subsequences);
//    }
//
//    public static int countGreaterSubsequences(String s, String t) {
//        TreeSet<String> subsequences = new TreeSet<>(); // Sorted set to store subsequences
//        generateSubsequences(s, 0, new StringBuilder(), subsequences);
//
//        int count = 0;
//        for (String sub : subsequences) {
//            if (sub.compareTo(t) > 0) { // Lexicographical comparison
//                count = (count + 1) % MODULO; // Apply modulo to prevent overflow
//            }
//        }
//
//        return count;
//
//
//    }

//    private static final int MOD = 1_000_000_007;
//
//    public static int countSecuredStrings(String s, String t) {
//        int n = s.length();
//        int m = t.length();
//        Map<String, Integer> subseqCount = new HashMap<>();
//
//        // Generate all subsequences using an optimized recursive approach
//        generateSubsequences(s, 0, "", subseqCount);
//
//        int count = 0;
//
//        // Count subsequences that are lexicographically greater than t
//        for (String sub : subseqCount.keySet()) {
//            if (sub.compareTo(t) > 0) {
//                count = (count + subseqCount.get(sub)) % MOD;
//            }
//        }
//
//        return count;
//    }
//
//    private static void generateSubsequences(String s, int index, String current, Map<String, Integer> subseqCount) {
//        if (index == s.length()) {
//            if (!current.isEmpty()) {
//                subseqCount.put(current, subseqCount.getOrDefault(current, 0) + 1);
//            }
//            return;
//        }
//
//        // Include the current character
//        generateSubsequences(s, index + 1, current + s.charAt(index), subseqCount);
//
//        // Exclude the current character
//        generateSubsequences(s, index + 1, current, subseqCount);
//    }

    private static final int MOD = (int) (1e9 + 7);

    public static int countGreaterSubsequences(String s, String t) {
        int m = s.length();
        int n = t.length();

        // Initialize dp array with zeros
        int[][] dp = new int[m + 1][n + 1];

        // Base case: all subsequences are greater when t is empty
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(i) > t.charAt(j)) {
                    // Include s[i] or not
                    dp[i][j] = (dp[i + 1][j] + dp[i + 1][j + 1]) % MOD;
                } else {
                    // Cannot include s[i]
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }

        // The answer is stored in dp[0][0]
        return dp[0][0];
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ab";
        System.out.println(countGreaterSubsequences(s, t));
    }







}

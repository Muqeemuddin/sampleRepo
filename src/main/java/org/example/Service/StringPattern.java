package org.example.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPattern {

        int MAX_VOWELS;
        int res;
        private final static int C = 21;
        private final static int V = 5;

        public int getNumOfUniqueWords(int wordLen, int maxVowels) {
            MAX_VOWELS = maxVowels;
            res = 0;
            int[] word = new int[wordLen];  // use 21 for 'c' and 5 for 'v'
            Arrays.fill(word, C);  // fill consonants by default
            backtrack(word, 0, maxVowels);
            return res;
        }

        private void backtrack(int[] word, int index, int maxVowels) {
            // finish one solution, add its product to res
            if (index == word.length) {
                int count = 1;
                for (int num : word) {
                    count *= num;
                }
                res += count;
                return;
            }
            if (maxVowels == 0) {
                // if we run out of credit for consecutive vowels,
                // do nothing for this index, and reset credits for the next index
                backtrack(word, index + 1, MAX_VOWELS);
                return;
            }

            // do selections
            // 1. either select a vowel
            word[index] = V;
            backtrack(word, index + 1, maxVowels - 1);  // notice maxVowel credits - 1
            word[index] = C;  // cancel selection

            // 2. or do nothing
            backtrack(word, index + 1, maxVowels);
        }
    }



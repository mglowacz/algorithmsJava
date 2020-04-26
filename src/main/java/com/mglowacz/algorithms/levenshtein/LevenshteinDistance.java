package com.mglowacz.algorithms.levenshtein;

import static java.util.Arrays.asList;
import static java.util.Collections.min;

public class LevenshteinDistance {
    public int calculateDistance(String string1, String string2) {
        int[][] m = new int[string1.length() + 1][string2.length() + 1];
        for (int i = 1; i < string1.length() + 1; i++) m[i][0] = i;
        for (int j = 1; j < string2.length() + 1; j++) m[0][j] = j;

        for(int i = 0 ; i < string1.length() ; i++)
            for(int j = 0 ; j < string2.length() ; j++) {
                int cost = string1.charAt(i) == string2.charAt(j) ? 0 : 1;
                m[i+1][j+1] = min(asList(m[i+1][j] + 1, m[i][j+1]+1, m[i][j]+ cost));
            }

        return m[string1.length()][string2.length()];
    }
}

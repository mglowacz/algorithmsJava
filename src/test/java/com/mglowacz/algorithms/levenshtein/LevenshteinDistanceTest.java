package com.mglowacz.algorithms.levenshtein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevenshteinDistanceTest {

    private LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

    @Test
    public void test() {
        assertEquals(0, levenshteinDistance.calculateDistance("pies", "pies"));
        assertEquals(1, levenshteinDistance.calculateDistance("granat", "granit"));
        assertEquals(3, levenshteinDistance.calculateDistance("orczyk", "oracz"));
        assertEquals(4, levenshteinDistance.calculateDistance("marka", "ariada"));
    }
}

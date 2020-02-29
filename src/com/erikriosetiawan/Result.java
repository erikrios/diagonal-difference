package com.erikriosetiawan;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    firstDiagonal.add(arr.get(i).get(j));
                }
                if (i + j == arr.size() - 1) {
                    secondDiagonal.add(arr.get(i).get(j));
                }
            }
        }

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int i = 0; i < firstDiagonal.size(); i++) {
            firstDiagonalSum += firstDiagonal.get(i);
            secondDiagonalSum += secondDiagonal.get(i);
        }
        return Math.abs(firstDiagonalSum - secondDiagonalSum);
    }
}

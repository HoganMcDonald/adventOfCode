package com.hoganmcdonald;

public class Main {

    public static void main(String[] args) {
        int daysComplete = 3;

        int[] results = new int[] {Day1.solve(),
                Day2.solve(),
                Day3.solve()};


        for (int i = 1; i <= daysComplete; i++) {
            String day = Integer.toString(i);
            String result = Integer.toString(results[i - 1]);
            System.out.printf("%nDay %s : %s%n", day, result);
        }
    }
}

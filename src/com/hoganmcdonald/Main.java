package com.hoganmcdonald;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int daysComplete = 4;

        int[] results = new int[0];
        try {
            results = new int[] {Day1.solve(),
                    Day2.solve(),
                    Day3.solve(),
                    Day4.solve()};
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] bonuses = new int[] {Day1.bonus(),
                Day2.bonus(),
                Day3.bonus()};


        for (int i = 1; i <= daysComplete; i++) {
            String day = Integer.toString(i);
            String result = Integer.toString(results[i - 1]);
            if (bonuses.length < i) {
                System.out.printf("Day %s : %s%n", day, result);
            } else {
                String bonus = Integer.toString(bonuses[i - 1]);
                System.out.printf("Day %s : %s%n  Bonus: %s%n", day, result, bonus);
            }

        }
    }
}

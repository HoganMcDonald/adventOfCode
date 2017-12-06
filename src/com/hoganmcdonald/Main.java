package com.hoganmcdonald;

public class Main {

    public static void main(String[] args) {
        int daysComplete = 3;

        int[] results = new int[] {Day1.solve(),
                Day2.solve(),
                Day3.solve()};

        int[] bonuses = new int[] {Day1.bonus()};


        for (int i = 1; i <= daysComplete; i++) {
            String day = Integer.toString(i);
            String result = Integer.toString(results[i - 1]);
            if (bonuses.length < i) {
                System.out.printf("Day %s : %s%n", day, result);
            } else {
                String bonus = Integer.toString(bonuses[i - 1]);
                System.out.printf("Day %s : %s%n  Bonus: %s %n", day, result, bonus);
            }

        }
    }
}

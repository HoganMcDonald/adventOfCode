package com.hoganmcdonald;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day4 {
    private static String[] parseInput() throws IOException {
        Scanner file = new Scanner(new File("inputs/day4.txt"));
        int lines = 512;
        String[] passphrases = new String[lines];

        int lineNumber = 0;
        while (file.hasNextLine()) {
            passphrases[lineNumber] = file.nextLine();
            lineNumber++;
        }

        return passphrases;
    }

    public static int solve() throws IOException {
        int result = 0;
        String[] phrases = parseInput();

        for (int i = 0; i < phrases.length; i++) {
            String[] words = phrases[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                for (int k = 1; k < words.length; k++) {
                    if (words[j].equals(words[k]) && j != k) {
                        result += 1;
                    }
                }
            }
        }

        return 512 - result;
    }

}

package com.hoganmcdonald;

public class Day3 {
    // 347991
    private static int input = 347991;

    private static int highestX = 0;
    private static int lowestX = 0;
    private static int highestY = 0;
    private static int lowestY = 0;

    public static int solve() {
        int[] coordinates = spiral(input);
        System.out.printf("coordinates are: (%d, %d)", coordinates[0], coordinates[1]);

        int path = Math.abs(coordinates[0]) + Math.abs(coordinates[1]);
        return path;
    }

    private static int[] spiral(int iterations) {
        int iteration = 1;
        String direction = "right";
        int xCoordinate = 0;
        int yCoordinate = 0;

        while (iteration < iterations) {
            switch (direction) {
                case "right":
                    if (xCoordinate == highestX + 1) {
                        highestX = xCoordinate;
                        direction = "up";
                    } else {
                        xCoordinate++;
                        iteration++;
                    }
                    break;
                case "up":
                    if (yCoordinate == highestY + 1) {
                        highestY = yCoordinate;
                        direction = "left";
                    } else {
                        yCoordinate++;
                        iteration++;
                    }
                    break;
                case "left":
                    if (xCoordinate == lowestX - 1) {
                        lowestX = xCoordinate;
                        direction = "down";
                    } else {
                        xCoordinate--;
                        iteration++;
                    }
                    break;
                case "down":
                    if (yCoordinate == lowestY - 1) {
                        lowestY = yCoordinate;
                        direction = "right";
                    } else {
                        yCoordinate--;
                        iteration++;
                    }
                    break;
                default:
                    return new int[] {0, 0};
            }
        }
        return new int[] {xCoordinate, yCoordinate};
    }

}

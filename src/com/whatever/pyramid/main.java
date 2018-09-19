package com.whatever.pyramid;

import java.util.Scanner;
public class main {
    private static Scanner inputReader = new Scanner(System.in);
    public static void main(String [ ] args) {
        int inputInt = getInput();
        drawPyramid(inputInt);
    }

    private static int getInput(){
        int input = -1;
        while (input < 0 || input > 23){
            System.out.println("Please enter a number from 0 to 23:");
            input = inputReader.nextInt();
        }
        return input;
    }

    private static void drawPyramid(int rows){
        for (int i = 0; i < rows; i++){
            for (int space = (rows - i); space >= 0; space--){
                System.out.print(" ");
            }
            for (int pound = 0; pound < i + 2; pound++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

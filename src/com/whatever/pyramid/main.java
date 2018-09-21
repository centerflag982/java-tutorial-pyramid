package com.whatever.pyramid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class main {
    private static Scanner inputReader = new Scanner(System.in);
    public static void main(String [ ] args) {
        int inputInt = getInput();
        int outputTypeInt = getOutputType();
        drawPyramid(inputInt, outputTypeInt);
    }

    private static int getInput(){
        int input = -1;
        while (input < 0 || input > 23){
            System.out.println("Please enter a number from 0 to 23:");
            input = inputReader.nextInt();
        }
        return input;
    }

    private static int getOutputType(){
        int output = -1;
        while (output < 1 || output > 3) {
            System.out.println("Enter 1 to output to console, or 2 to output to file.");
            output = inputReader.nextInt();
        }
        return output;
    }

    private static void drawPyramid(int input, int outputType){
        if (outputType == 1){
            drawPyramidToConsole(input);
        }
        else{
            drawPyramidToFile(input);
        }
    }

    private static void drawPyramidToConsole(int rows){
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

    private static void drawPyramidToFile(int rows){
        try {
            PrintWriter outputWriter = new PrintWriter("pyramidOutput.txt");
            for (int i = 0; i < rows; i++){
                for (int space = (rows - i); space >= 0; space--){
                    outputWriter.append(" ");
                }
                for (int pound = 0; pound < i + 2; pound++){
                    outputWriter.append("#");
                }
                outputWriter.println();
            }
            outputWriter.close();
        }
        catch (IOException e) {
            //Everything is fine, nothing to see here, move along
        }
    }
}

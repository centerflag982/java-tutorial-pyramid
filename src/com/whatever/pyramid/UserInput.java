package com.whatever.pyramid;

import java.util.Scanner;

class UserInput {

    private Scanner inputReader = new Scanner(System.in);

    int getInputRows(){
        int inputRows = -1;
        while (inputRows < 0 || inputRows > 23){
            System.out.println("Please enter a number from 0 to 23:");
            inputRows = inputReader.nextInt();
        }
        return inputRows;
    }

    OutputStrategy getOutputType(){
        OutputStrategy outputOutputStrategy;
        int output = -1;
        while (output < 1 || output > 3) {
            System.out.println("Enter 1 to output to console, or 2 to output to file.");
            output = inputReader.nextInt();
        }
        if (output == 2){
            outputOutputStrategy = new DrawPyramidFile();
        }
        else
        {
            outputOutputStrategy = new DrawPyramidConsole();
        }
        return outputOutputStrategy;
    }
}

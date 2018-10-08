package com.centerflag982.launchcode.pyramid;

import com.centerflag982.launchcode.pyramid.pyramidDrawers.DrawPyramidConsole;
import com.centerflag982.launchcode.pyramid.pyramidDrawers.DrawPyramidFile;

import java.util.Scanner;

class PyramidBuilder {

    //---------Singleton implementation----------
    private PyramidBuilder() {}

    private static PyramidBuilder pyramidBuilder;
    static PyramidBuilder getInstance() {
        if (pyramidBuilder == null){
            pyramidBuilder = new PyramidBuilder();
        }
        return pyramidBuilder;
    }
    //-------------------------------------------

    private Scanner inputReader = new Scanner(System.in);

    int getInputRows(){
        int inputRows = -1;
        while (inputRows < 0 || inputRows > 23){
            System.out.println("Please enter a number from 0 to 23:");
            inputRows = inputReader.nextInt();
        }
        return inputRows;
    }

    OutputType getOutputType(){
        OutputType outputType;
        int output = -1;
        while (output < 1 || output > 3) {
            System.out.println("Enter 1 to output to console, or 2 to output to file.");
            output = inputReader.nextInt();
        }
        if (output == 2){
            outputType = new DrawPyramidFile();
        }
        else
        {
            outputType = new DrawPyramidConsole();
        }
        return outputType;
    }

    String buildPyramidString(int rows){
        StringBuilder pyramidStringBuilder = new StringBuilder();
        for (int i = 0; i < rows; i++){
            for (int space = (rows - i); space >= 0; space--){
                pyramidStringBuilder.append(" ");
            }
            for (int pound = 0; pound < i + 2; pound++){
                pyramidStringBuilder.append("#");
            }
            pyramidStringBuilder.append("\n");
        }
        return pyramidStringBuilder.toString();
    }

    void sendToDrawer(OutputType type, String pyramidString){
        type.drawPyramid(pyramidString);
    }
}

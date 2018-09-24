package com.whatever.pyramid;

import java.io.IOException;
import java.io.PrintWriter;

public class DrawPyramidFile implements OutputStrategy {
    public void drawPyramid(int rows){
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

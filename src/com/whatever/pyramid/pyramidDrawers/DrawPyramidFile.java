package com.whatever.pyramid.pyramidDrawers;

import com.whatever.pyramid.OutputType;

import java.io.IOException;
import java.io.PrintWriter;

public class DrawPyramidFile implements OutputType {
    public void drawPyramid(String pyramidString){
        try {
            PrintWriter outputWriter = new PrintWriter("pyramidOutput.txt");
            outputWriter.println(pyramidString);
            outputWriter.close();
        }
        catch (IOException e) {
            //Everything is fine, nothing to see here, move along
        }
    }
}

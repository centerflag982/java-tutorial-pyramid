package com.centerflag982.launchcode.pyramid.pyramidDrawers;

import com.centerflag982.launchcode.pyramid.OutputType;

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

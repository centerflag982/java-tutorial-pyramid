package com.whatever.pyramid.pyramidDrawers;

import com.whatever.pyramid.OutputType;

public class DrawPyramidConsole implements OutputType {
    public void drawPyramid(String pyramidString){
        /*for (int i = 0; i < rows; i++){
            for (int space = (rows - i); space >= 0; space--){
                System.out.print(" ");
            }
            for (int pound = 0; pound < i + 2; pound++){
                System.out.print("#");
            }
            System.out.print("\n");
        }*/
        System.out.print(pyramidString);
    }
}

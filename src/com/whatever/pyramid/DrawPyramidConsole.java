package com.whatever.pyramid;

public class DrawPyramidConsole implements OutputStrategy {
    public void drawPyramid(int rows){
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

package com.whatever.pyramid;


public class Main {

    public static void main(String [ ] args) {
        UserInput userInput = new UserInput();
        DrawingContext drawingContext;
        OutputStrategy outputStrategy;
        int inputRows;

        inputRows = userInput.getInputRows();
        outputStrategy = userInput.getOutputType();
        drawingContext = new DrawingContext(outputStrategy);

        drawingContext.executeStrategy(inputRows);
    }
}

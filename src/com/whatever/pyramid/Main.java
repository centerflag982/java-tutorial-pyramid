package com.whatever.pyramid;


public class Main {

    public static void main(String [ ] args) {
        PyramidBuilder pyramidBuilder = new PyramidBuilder();
        DrawingSelector drawingSelector;
        OutputType outputType;
        int inputRows;
        String pyramidString;

        inputRows = pyramidBuilder.getInputRows();
        outputType = pyramidBuilder.getOutputType();
        pyramidString = pyramidBuilder.buildPyramidString(inputRows);
        //drawingSelector = new DrawingSelector(outputType);
        //drawingSelector.sendToDrawer(pyramidString);
        pyramidBuilder.sendToDrawer(outputType, pyramidString);
    }
}

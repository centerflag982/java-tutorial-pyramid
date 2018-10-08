package com.centerflag982.launchcode.pyramid;


public class Main {

    public static void main(String [ ] args) {
        Main runInstance = new Main(PyramidBuilder.getInstance());
    }

    private PyramidBuilder pyramidBuilder;

    public Main(PyramidBuilder pyramidBuilder) {
        this.pyramidBuilder = pyramidBuilder;
    }

    public void run() {
        OutputType outputType;
        int inputRows;
        String pyramidString;

        inputRows = pyramidBuilder.getInputRows();
        outputType = pyramidBuilder.getOutputType();
        pyramidString = pyramidBuilder.buildPyramidString(inputRows);
        pyramidBuilder.sendToDrawer(outputType, pyramidString);
    }
}

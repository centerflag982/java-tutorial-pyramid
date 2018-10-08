package com.centerflag982.launchcode.pyramid;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String [ ] args) {
        //Main runInstance = new Main(PyramidBuilder.getInstance());

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Main mainInst = (Main) context.getBean("runInstance");
        mainInst.run();
    }

    private PyramidBuilder pyramidBuilder;

    public Main(PyramidBuilder pyramidBuilder) {
        this.pyramidBuilder = pyramidBuilder;
    }

    private void run() {
        OutputType outputType;
        int inputRows;
        String pyramidString;

        inputRows = pyramidBuilder.getInputRows();
        outputType = pyramidBuilder.getOutputType();
        pyramidString = pyramidBuilder.buildPyramidString(inputRows);
        pyramidBuilder.sendToDrawer(outputType, pyramidString);
    }
}

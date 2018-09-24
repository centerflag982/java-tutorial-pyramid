package com.whatever.pyramid;

class DrawingContext {
    private OutputStrategy strategy;

    DrawingContext(OutputStrategy outputStrategy){
        this.strategy = outputStrategy;
    }

    void executeStrategy(int rows){
        strategy.drawPyramid(rows);
    }
}

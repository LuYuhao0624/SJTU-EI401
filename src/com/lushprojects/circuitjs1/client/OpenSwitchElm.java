package com.lushprojects.circuitjs1.client;

public class OpenSwitchElm extends SwitchElm{
    public OpenSwitchElm(int xa, int ya, int xb, int yb, int f) {
        super(xa, ya, xb, yb, f);
        position = 1;
        momentary = false;
        posCount = 2;
    }

    @Override
    void draw(Graphics g) {
        if (supervisor) {
            super.draw(g);
        }
    }

    @Override
    void initBoundingBox() {
        if (supervisor) {
            super.initBoundingBox();
        }
        else {
            boundingBox = new Rectangle();
        }
    }

    @Override
    boolean needDump() {
        return false;
    }

    @Override
    void shortFlipElement(CirSim cs, int mal) {}

    @Override
    void openFlipElement(CirSim cs, int mal) {}

    @Override
    void setMouseElm(boolean v) {
        mouseElmRef = main;
    }

}

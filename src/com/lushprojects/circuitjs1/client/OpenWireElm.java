package com.lushprojects.circuitjs1.client;

public class OpenWireElm extends WireElm {
    public OpenWireElm(int xa, int ya, int xb, int yb, int f,
                        StringTokenizer st) {
        super(xa, ya, xb, yb, f, st);
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

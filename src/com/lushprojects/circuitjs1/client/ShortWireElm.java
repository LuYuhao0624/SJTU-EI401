package com.lushprojects.circuitjs1.client;

public class ShortWireElm extends WireElm {

    public ShortWireElm(int xa, int ya, int xb, int yb, int f,
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
    boolean needDump() {
        return false;
    }

    @Override
    void shortFlipElement(CirSim cs, int mal) {}

    @Override
    void openFlipElement(CirSim cs, int mal) {}

//    @Override
//    void setBbox(int x1, int y1, int x2, int y2) {}
//
//    @Override
//    void setBbox(Point p1, Point p2, double w) {}
//
//    @Override
//    void adjustBbox(int x1, int y1, int x2, int y2) {}
//
//    @Override
//    void adjustBbox(Point p1, Point p2) {}
//
//    @Override
//    Rectangle getBoundingBox() {
//        return new Rectangle();
//    }

    @Override
    void setMouseElm(boolean v) {
        mouseElmRef = main;
    }

}

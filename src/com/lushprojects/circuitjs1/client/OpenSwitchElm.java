package com.lushprojects.circuitjs1.client;

public class OpenSwitchElm extends SwitchElm{
    public OpenSwitchElm(int xa, int ya, int xb, int yb, int f) {
        super(xa, ya, xb, yb, f);
        position = 1;
        momentary = false;
        posCount = 2;
        settled = true;
    }

    @Override
    void draw(Graphics g) {
        if (sim.supervisor && sim.fullVersion) {
            super.draw(g);
        }
    }

    @Override
    void initBoundingBox() {
        if (sim.supervisor && sim.fullVersion) {
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
    void shortFlipElement(int mal) {}

    @Override
    void openFlipElement(int mal) {}

    @Override
    void setMouseElm(boolean v) {
        mouseElmRef = main;
    }

    void getInfo(String arr[]) {
        arr[0] = "OS";
    }

}

package com.unidev.fn;

public enum SizeType {

    US(0), Europe(1), UK(2), Inc(3), CM(4);

    private int index;

    SizeType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

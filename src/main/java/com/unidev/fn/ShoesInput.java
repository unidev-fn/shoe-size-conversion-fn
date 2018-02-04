package com.unidev.fn;

public class ShoesInput {

    public String size;
    public String type;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShoesInput{");
        sb.append("size='").append(size).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

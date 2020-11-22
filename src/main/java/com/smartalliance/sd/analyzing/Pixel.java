package com.smartalliance.sd.analyzing;

public class Pixel {
    private short color1;
    private short color2;
    private short color3;

    public Pixel(short[] colors) {
        color1 = colors[0];
        color2 = colors[1];
        color3 = colors[2];
    }

    public short[] getColor(){
        return new short[]{color1, color2, color3};
    }
}

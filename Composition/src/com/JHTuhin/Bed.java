package com.JHTuhin;

public class Bed {
    private String style;
    private int height;
    private int sheets;
    private int pillows;
    private int quilt;

    public Bed(String style, int height, int sheets, int pillows, int quilt) {
        this.style = style;
        this.height = height;
        this.sheets = sheets;
        this.pillows = pillows;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }
    public void make(){
        System.out.println("The bed is being made");
    }
}

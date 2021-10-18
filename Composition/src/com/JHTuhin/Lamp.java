package com.JHTuhin;

public class Lamp {
    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public String getStyle() {
        return style;
    }

    public void turnOn(){
        System.out.println(("The lamp is being turned on"));

    }
    public boolean isBattery(){
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}

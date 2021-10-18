package com.JHTuhin;

public class Main {

    public static void main(String[] args) {
	    Wall wall1= new Wall("East");
        Wall wall2= new Wall("West");
        Wall wall3= new Wall("North");
        Wall wall4= new Wall("South");
        Ceiling ceiling=new Ceiling(20,12);
        Lamp lamp=new Lamp("Classic",true,32);
        Bed bed= new Bed("Modern",3,2,4,2);
        Bedroom bedRoom= new Bedroom("Jack's",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}

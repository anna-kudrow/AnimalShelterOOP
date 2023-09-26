package ru.umkonline.projectnursery;

import java.util.Date;

public abstract class Animal {

    private String type;
    private String size;
    private int age;
    private String color;
    private Date dateArrived;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Animal(String type) {
        this.type = type;
        this.dateArrived = new Date();
        this.size = "medium";
        this.age = 0;
    }

    Animal(String size, int age, String color, String type){

        this.dateArrived = new Date();
        this.size = size;
        this.age = age;
        if(color != null){
            this.color = color;
        }

    }

    abstract boolean eat (float weight, String food);
    abstract int sleep();

    public final int sit(){

        Date currentDate = new Date();
//        int days = (int)(currentDate.getTime() - this.dateArrived.getTime())/(60*60*24*1000);
        int seconds = (int)(currentDate.getTime() - this.dateArrived.getTime())/(1000);
        return seconds;
    }

}

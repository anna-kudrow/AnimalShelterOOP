package ru.umkonline.projectnursery;

public class Dog extends Animal{

    private String breed;


    Dog(String type){
        super(type);
        this.breed = "unknown";
    }

    Dog(String breed, String size, int age, String color, String type){

        super(size, age, color, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    boolean eat (float weight, String food){
        return true;
    }

    int sleep(){
        return 5;
    }


    float run(int task){
        return 0.42f;
    }
}

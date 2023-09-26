package ru.umkonline.projectnursery;

public class Cat extends Animal{
    public Cat(String type) {
        super(type);
    }

    @Override
    boolean eat(float weight, String food) {
        return false;
    }

    @Override
    int sleep() {
        return 0;
    }
}

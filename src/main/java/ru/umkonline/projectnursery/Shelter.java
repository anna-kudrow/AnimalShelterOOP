package ru.umkonline.projectnursery;

import java.util.Scanner;

public class Shelter {

    public static Scanner in;

    public static void addNewDog(int i, Dog[] dogs){
//        in = new Scanner(System.in);
        String breed, size, color;
        int age;
        System.out.println("Enter breed: ");
        breed = in.nextLine();
        System.out.println("Enter size: ");
        size = in.nextLine();
        System.out.println("Enter age: ");
        age = in.nextInt();
        in.nextLine();
        System.out.println("Enter color: ");
        color = in.nextLine();
        dogs[i] = new Dog(breed, size, age, color, "Dog");
    }

    public static void showAllDogs(int size, Dog[] dogs){

        for(int i = 0; i < size; i++){
            System.out.println((i + 1) + ") " + dogs[i].getBreed() + " " + dogs[i].getSize() + " " + dogs[i].getAge() + " " + dogs[i].getColor());
            System.out.println((i + 1) + ") seconds sits in the shelter: " + dogs[i].sit());

        }

    }

    public static void editDogFields(int count, Dog[] dogs){

        int i = 0;
        System.out.println("Enter a number of a dog");
        i = in.nextInt();
        in.nextLine();
        i++;
        if (i >= 1 && i <= count){
            System.out.println("OLD data: "+(i + 1) + ") " + dogs[i].getBreed() + " " + dogs[i].getSize() + " " + dogs[i].getAge() + " " + dogs[i].getColor());
            String breed, size, color;
            int age;
            System.out.println("Enter new size: ");
            size = in.nextLine();
            dogs[i].setSize(size);
            System.out.println("Enter new age: ");
            age = in.nextInt();
            in.nextLine();
            dogs[i].setAge(age);

        }
        else{
            System.out.println("error: number of dog incorrect");
        }

    }

    public static void main(String[] args) {

        System.out.println("Shelter for dogs");
        in = new Scanner(System.in);
        String command;

        Dog[] dogs = new Dog[10];
        int count = 0;

        while(true) {
            System.out.println("Enter command: ");
            command = in.nextLine();
            switch (command){
                case "add":
                    System.out.println("Add new dog");
                    if(count<10) {

                        addNewDog(count,dogs);
                        count++;
                        System.out.println("New dog was added");
                    }
                    else{
                        System.out.println("Nursery is full!");
                    }
                    break;
                case "list":
                    System.out.println("Show all dogs");
                    if(count>0){
                        showAllDogs(count, dogs);
                    }
                    else{
                        System.out.println("Nursery is empty");
                    }
                    break;
                case "edit":
                    System.out.println("Edit data for some dog");
                    if(count>0){
                        editDogFields(count, dogs);
                    }
                    else{
                        System.out.println("Nursery is empty");
                    }
                    break;
                case "exit":
                    in.close();
                    return;
                default:
                    System.out.println("Unknown command");
            }

        }
    }
}

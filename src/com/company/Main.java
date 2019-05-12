package com.company;

import java.util.Scanner;

class Car{
    private String name;
    private Boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name,int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public Boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Engine starts";
    }

    public String accelerate(){
        return "Accelerated";
    }

    public String brake(){
        return "Braked";
    }
}

class Toyota extends Car{
    public Toyota(){
        super("Toyota",4);
    }

    @Override
    public String startEngine() {
        return "Toyota Engine starts";
    }

    @Override
    public String accelerate() {
        return "Toyota Accelerated";
    }

    @Override
    public String brake() {
        return "Toyota Braked";
    }
}

class Nissan extends Car{
    public Nissan(){
        super("Nissan",3);
    }

    @Override
    public String startEngine() {
        return "Nissan Engine starts";
    }

    @Override
    public String accelerate() {
        return "Nissan Accelerated";
    }

    @Override
    public String brake() {
        return "Nissan Braked";
    }
}

class Honda extends Car{
    public Honda(){
        super("Honda",6);
    }

    @Override
    public String startEngine() {
        return "Honda Engine starts";
    }

    @Override
    public String accelerate() {
        return "Honda Accelerated";
    }

    @Override
    public String brake() {
        return "Honda Braked";
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the num : ");
        int i = sc.nextInt();
        switch (i){
            case 1:
                Car car1 = new Toyota();
                System.out.println(car1.startEngine()+" "+car1.accelerate()+" "+car1.brake());
                break;

            case 2:
                Car car2 = new Nissan();
                System.out.println(car2.startEngine()+" "+car2.accelerate()+" "+car2.brake());
                break;

            case 3:
                Car car3 = new Honda();
                System.out.println(car3.startEngine()+" "+car3.accelerate()+" "+car3.brake());
                break;

            default:
                System.out.println("Error");

        }
    }
}

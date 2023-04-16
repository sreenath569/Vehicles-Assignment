package com.driver;

public class F1 extends Car {

    private String name;
    private int currentSpeed;
    private int currentDirection;
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 4, 6, isManual, "family", 4);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @Override
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public int getCurrentDirection() {
        return this.currentDirection;
    }

    @Override
    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getDoors() {
        return this.doors;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public int getGears() {
        return this.gears;
    }

    @Override
    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public boolean isManual() {
        return this.isManual;
    }

    @Override
    public void setManual(boolean manual) {
        isManual = manual;
    }

    @Override
    public int getCurrentGear() {
        return this.currentGear;
    }

    @Override
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    @Override
    public int getSeats() {
        return this.seats;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
        }
        //for all other cases, change the gear accordingly
        else if(newSpeed>=1 && newSpeed<=50){
            changeGear(1);
        }
        else if(newSpeed>=50 && newSpeed<=100){
            changeGear(2);
        }
        else if(newSpeed>=101 && newSpeed<=150){
            changeGear(3);
        }
        else if(newSpeed>=151 && newSpeed<=200){
            changeGear(4);
        }
        else if(newSpeed>=201 && newSpeed<=250){
            changeGear(5);
        }
        else{
            changeGear(6);
        }


        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

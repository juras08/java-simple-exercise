package com.myapp;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Bicycle first_bicycle = new Bicycle(3,21,45);
        first_bicycle.setGear(24);
        System.out.println("Speed is " + first_bicycle.getSpeed() + " and the gear is " + first_bicycle.getGear());

        MountainBike second_bicycle = new MountainBike(3,5,21,45);
        System.out.println("Second bicycle speed is " + second_bicycle.getSpeed() + " and seat height is " + second_bicycle.getSeatHeight());

    }

}


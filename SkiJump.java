//Programmers: Dina Quevedo
//Course: CS 212
//Due Date: 2/1/24
//In Class Assessment: 3
//Problem Statement: create a program to calculate the distance traveled based on speed and determine how many points the user would receive
//Data In:
//Data Out:
//Credits: Assessment Prompt

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.round;

class SkiJump {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String hill_type = "normal";
        int height = 46;
        double points_per_meter = 2;
        int par = 90;

        System.out.println("Are you on a normal hill (yes or no)? ");
        if(input.nextLine().equalsIgnoreCase("n0")) {

            hill_type = "large";
            height = 70;
            points_per_meter = 1.8;
            par = 120;
        }

        System.out.println("What is your speed? ");
        double speed = input.nextDouble();

        double time_in_air = Math.sqrt((2 * height) / 9.8);
        double distance_traveled = speed * time_in_air;

        double points_earned = 60 + (distance_traveled - par) * points_per_meter;

        System.out.println("You earned "+ points_earned + " on the "+ hill_type+ " hill!\n");

        if (points_earned > 60){
            System.out.println("Great job for doing better than par!");
        }
        else if (points_earned < 10){
            System.out.println("What heppend??");
        }
        else {
            System.out.println("Sorry you didn't go very far");
        }
        
    }
}

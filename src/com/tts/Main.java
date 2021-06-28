package com.tts;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tommy's Online Auto Shop." + "\n" + "We currently have Honda, Ford, and Hyundai models in stock." + "\n" + "Please enter the Make of car you would like to see, and we'll show you our current inventory.");
        String answer = scan.next();

        if (answer.equalsIgnoreCase("honda")) {

            HashMap<String, String> honda = new HashMap<String, String>();
            honda.put("Honda:CR-V ", "2015 Excellent Condition");
            honda.put("Honda:Pilot ", "2018 Some Work Needed");
            honda.put("Honda:Civic ", "1998 Good Condition");

            System.out.println("Excellent choice." + "\n" + "Here are the current Honda models we have available" + "\n" + honda);
        }

        if (answer.equalsIgnoreCase("ford")) {

            HashMap<String, String> ford = new HashMap<String, String>();
            ford.put("Ford:F-150 ", "2019 Excellent Condition");
            ford.put("Ford:Explorer ", "1997 Some Work Needed");
            ford.put("Ford:Mustang ", "2005 Good Condition");

            System.out.println("Excellent choice." + "\n" + "Here are the current Ford models we have available" + "\n" + ford);
        }

        if (answer.equalsIgnoreCase("hyundai")) {

            HashMap<String, String> hyundai = new HashMap<String, String>();
            hyundai.put("Hyundai:Accent ", "2001 Some Work Needed");
            hyundai.put("Hyundai:Santro ", "2015 Good Condition");
            hyundai.put("Hyundai:Aura ", "2019 Excellent Condition");

            System.out.println("Excellent choice." + "\n" + "Here are the current Hyundai models we have available" + "\n" + hyundai);
        }

        System.out.println("\n" + "Please contact our salesman to schedule an appointment");


    }
}

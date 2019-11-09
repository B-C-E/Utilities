package com.pack;

//IMPORTS HERE

import java.time.format.DateTimeFormatter;//these are non essential example imports
import java.time.LocalDateTime;          // they are only used by one example method (subSelection)

//This is a utility class I (B-C-E) made for drivers.
//It is designed to be copied and edited as per a users desires,
//but does have a few handy methods
//Please use in conjunction with the GetInput class
public class BasicDriver
{

    public static void main(String args[])
    {
        //VARIABLES
        boolean b_readyToExit = false;


        //INTRO
        System.out.println("Hello and welcome to the Basic Driver class!");

        //LOOP
        while (!b_readyToExit)
        {
            //SELECTIONS
            System.out.println();
            System.out.println("Would you like to:");

            System.out.println("[s] Enter a Sub Menu of Selection options");
            System.out.println("[f] Print a smiley face to the screen");
            System.out.println("[e] Exit");

            //GET INPUT
            char c_input = GetInput.get('s', 'f', 'e');

            //DO ACTION
            switch (c_input)
            {
                //OPTION S - SUBOPTIONS
                case 's':
                    subSelection();
                    break;

                //OPTION F - FACE
                case 'f':
                    joy();
                    break;

                //OPTION E - EXIT
                case 'e':
                    b_readyToExit = true;
                    break;
            }//END OF SWITCH

        }//END OF DRIVER LOOP

        //EXIT MESSAGE
        System.out.println("Goodbye!");

    }//END OF MAIN


    //Example basic method
    public static void joy()
    {
        System.out.println(": ]");
    }//end of joy


    //SubSelection Example method
    //Doesn't loop, but could easily be changed to loop
    public static void subSelection()
    {
        boolean b_doneWithSubLoop = false;

        while (!b_doneWithSubLoop)
        {
            //SELECTIONS
            System.out.println("Did you want to:");

            System.out.println("[t] Display system time");
            System.out.println("[d] Do nothing");

            //GET INPUT
            char c_input = GetInput.get('t', 'd');

            //DO ACTION
            switch (c_input)
            {
                //OPTION T - TIME
                case 't':
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));
                    break;

                //OPTION N - NOTHING
                case 'd':
                    break;
            }

            //ONLY DO THIS SELECTION ONCE
            b_doneWithSubLoop = true;

        }//END OF WHILE
    }//end of subLoop

}//END OF BASICDRIVER

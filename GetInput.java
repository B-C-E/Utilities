package com.pack;

import java.util.Scanner;


//This is a utility class made by B-C-E
//(This sort of GetInput thing comes up a lot)
//Gets input from the user, and forces them to retype their input if it is bad

public class GetInput
{
    //gets the user to input yes or no
    //returns one of the characters (y,n)
    public static char getYN()
    {
        Scanner scn_kkb = new Scanner(System.in);//make a scanner
        while(true)
        {
            String input = scn_kkb.next();
            if (Character.toLowerCase(input.charAt(0)) == 'y')//if they typed yes
            {
                return 'y';
            } else if (Character.toLowerCase(input.charAt(0)) == 'n')//if they typed no
            {
                return 'n';
            } else//if they gave bad input
            {
                System.out.println("Please type Y or N.");
            }

            //No good input? Loop!
        }//end of loop
    }//end of getYN

    //from a range of ints [inclusive], select one
    public static int getRange(int min, int max)
    {
        Scanner scn_kkb = new Scanner(System.in);
        while (true)
        {
            String input = scn_kkb.next();
            for (int i = 0; i < input.length(); i++)//go through each character of the input
            {
                if (input.charAt(i) < 48 || input.charAt(i) > 57)//if the character is not a number, remove it
                {
                   input.replaceFirst(input.charAt(i)+"","");
                    i--;
                }

            }//end of going through each character of input and removing non numbers

        int numb = Integer.parseInt(input);

            if (numb >= min && numb <= max)
            {
                return numb;
            }
            else
            {
                System.out.println("Please type a number between " + min + " and " + max);
            }
            //No good input? Loop!
        }//end of loop
    }//end of getRange



    //from a selection of char options, get the user to choose one
    //if you run this with only one option, you will get an error
    public static char get(char ... options)
    {
            Scanner scn_kkb = new Scanner(System.in);//make a scanner
        while (true)
        {
            String input = scn_kkb.next();//get input from user
            input = input.toLowerCase();//convert to lower case

            //for all options, see if the user inputed that option
            for (int i = 0; i < options.length; i++)
            {
                if (input.charAt(0) == options[i])
                {
                    return options[i];
                }
            }//end of loop through all options

            //explain to the user what the program wants
            System.out.print("Please type " + options[0]);
            for (int i = 1; i < options.length; i++)
            {
                System.out.print(" or " + options[i]);
            }

            //No good input? Loop!
        }//end of loop
        }//end of get

    //gets the user to input a string with only lower case letters (and no numbers, etc)
    //and minimum size minSize
    public static String getCleanString(int minSize)
    {

        Scanner kkb = new Scanner(System.in);//scanner
        while (true)
        {
            String input = kkb.next().toLowerCase();//get an input string from user
            String toReturn = "";//this will be returned at the end
            for (int i = 0; i < input.length(); i++)//go through each character of the input
            {
                if (input.charAt(i) >= 97 && input.charAt(i) <= 122)//if the character is a letter, add it to the return
                {                                                   // string
                    toReturn += input.charAt(i);

                }
            }//end of going through each character of input

            if (toReturn.length() >= minSize)//if they gave some sort of good input
            {
                return toReturn;
            }//end of if they gave some sort of good input


            //explain what they did wrong
            if (toReturn.length() == 1)
            {
                System.out.println("Please input a string containing at least " + minSize + " letters.");
            } else
            {
                System.out.println("Please input a string containing only letters.");
            }
            //No good input? Loop!
        }//end of loop
    }//end of getCleanString


}//end of getInput

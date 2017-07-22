package com.company;

import java.io.*;
import java.util.*;
public class Main {

    public static void Initialize(Scanner console)
    {
        System.out.println("Welcome to the Task Manager!");


        boolean check1 = false;
        String yesFile = "";

        while(!check1)
        {
            System.out.print("Do you have an existing file (Y/N)? "); // im not sure if nextLine() will take in the prompt too
            yesFile = console.nextLine().toUpperCase();


            if(yesFile.length() != 1 || (yesFile.charAt(0) != 'Y' && yesFile.charAt(0) != 'N'))
            {
                System.out.println("Your Input was invalid. Try again!\n");
            }
            else
            {
                check1 = true;
            }
        }

        ArrayList<Task> taskList;

        if (yesFile.charAt(0) == 'Y')
        {
            taskList = readFromFile(console);
        }
        else
        {
            taskList = new ArrayList<Task>();
        }



    }

    public static ArrayList<Task> readFromFile (Scanner console)
    {
        boolean check2 = false;
        Scanner FileScanner = null;
        ArrayList<Task> taskList = null;
        while(!check2)
        {
            System.out.print("Enter your file name: ");
            String fileName = console.nextLine();

            try
            {
                FileScanner = new Scanner(new File(fileName));
                check2 = true;
            } catch (FileNotFoundException e)
            {
                System.out.println("That file was not found! Please Try again.\n");
                check2 = false;
                continue;
            }
        }

        return taskList;



    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        Initialize(console);
        console.close();


    }
}

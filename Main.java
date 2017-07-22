package com.company;

import java.io.*;
import java.util.*;

/**
 * This application serves as a task manager.
 * @author Yaswanth Malleedi
 */
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
        ArrayList<Task> taskList = new ArrayList<Task>();
        while(!check2)
        {
            System.out.print("Enter your file name: "); // note to self the file must be in the root directory
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

        // if it got here then we have a file. Now we need to read it.
        /*
        We need to come up with a way to do this. One way is to program one scanner to read a
        a delimiter.
         */


        //set scanner to use @nextTask@ as delimiter.
        FileScanner.useDelimiter("@nextTask@\\s+");


        while(FileScanner.hasNext())
        {
            //read the task
            String currTask = FileScanner.next();
            Scanner LineScanner = new Scanner(currTask);
            //first line is the task title
            String taskTitle = LineScanner.nextLine();
            String taskDesc = LineScanner.nextLine();
            int mm = LineScanner.nextInt();
            int dd = LineScanner.nextInt();
            int yy = LineScanner.nextInt();

            //create the task in the array
            
            LineScanner.close();
        }




        return taskList;



    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Initialize(console);
        console.close();


    }
}

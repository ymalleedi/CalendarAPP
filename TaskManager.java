import java.util.*;
public class TaskManager
{
  public static void Initialize()
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the Task Manager");
    //We are going to have to error handle this.
    System.out.print("Do you have an existing file? (Y/N)");
    char r1 = console.next().toUpperCase().charAt(0);
    //if the user wants to read a file then we must call another method.
    
    /**
    Here we have two options, we can learn to use the ArrayList and use it to store our Tasks, or we can restrict the user to a predefined
    amount of tasks. So that would mean the user can only create 1000 tasks, view them in one session.
    */
    if( r1 == 'Y')
      readFromFile(console); // this would have to return an existing task array.
    
  }
  
  
  public static void main (String[] args)
  {
    
  
  }
}

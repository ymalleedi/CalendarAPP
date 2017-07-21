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
    if( r1 == 'Y')
      readFromFile(console); // this would have to return an existing task array.
    
  }
  
  
  public static void main (String[] args)
  {
    
  
  }
}


/**
 * de clare two arays to be implimented.
 * one will be fill and one will be fill by user input.
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList; 
public class arrays
{
    
    /**
     * Constructor for objects of class arrays
     */
    public static void main(String [] args)
    
    {
        System.out.println("enter a list of five numbers  ");  
         int [] arryalist = arryalist(5);
        display(arryalist);
      System.out.println(" array2:");
      int [] array1 = {1,2,3,4,5};
      display(array1);
    }
    
    /**
     * to fill the arraylist with user input
     * @param n
     */
    public static int [] arryalist  (int n)
   {
       int [] result = new int [n];
       Scanner in = new Scanner(System.in);
      for(int i = 0;i<n;i++)
      {
          result[i]= in.nextInt(); 
       }
      return result;
    }
    
    
    /**
     * to display the arraylist
     * @param arryalist
     */
    public static void display(int[] arryalist)
    {
       System.out.println("array1:");

        for (Integer element : arryalist )
      {  
          element = element;
         System.out.print(element + " ")  ;    
      }  
    }

}

import java.util.Scanner;

public class CommonLoopAlgorithms
{
   /*
    * Loop Algorithm #1: Average
    * reads a series of numbers (ends with a letter)
    * calculates the average of the numbers
    * @return the average of the numbers
    */
  public static double average()
  {
      int total = 0;   // sum entered int
      int value = 0;   // number entered
      int amount = 0;  // the amount of numbers entered
      Scanner s = new Scanner(System.in);
      /*
       * Asking the user for numbers.
       * Entering a letter stops the loop.
       */
      do
      {
          System.out.println("Enter a number (enter a letter to quit):");
           
          if (s.hasNextInt() == false)     // if user input does not equal an int, break the loop
          {
              break;       // leave the loop
          }
          //value = s.nextInt();     // number that is entered
          total += value;          // sum of numbers
          amount++;                // adding 1 everytime a number is entered
      }
      while (true);
       
      if (amount == 0)             // if no numbers are entered, makes denominator positive
      {
          amount++;
      }
      return total / amount;       // returns the calculated average

  }

  /*
   * Loop Algorithm #2: Counting Matches
   * reads a series of numbers (ends with a letter)
   * counts the number of numbers that are greater than 100
   * @return the number of numbers that are greater than 100
   */
  public static int countMatches()
  {
      Scanner s = new Scanner(System.in);
      int count = 0;
      int value = 0;
      do
      {
          System.out.print("Please enter a number (enter a letter to quit): ");

          if(s.hasNextInt() == false)
          {
              break;
          }

          value = s.nextInt();

          if(value > 100)
          {
              count++;
          }
        }
      while(s.hasNextInt() == true);

      return count;
  }

   /*
    * Loop Algorithm #3: Finding the First Match
    * reads a series of words separated by whitespace
    * continues to read and count words until a word is longer than five characters
    * @return the number of words read before the match
    */
   public static int findFirstMatch()
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a series of words separated by whitespace: ");
       
       int words = -1; //initializing number of words before match
       String text; //declare temporary placeholder for text
       
       do 
       {
           text = s.next(); //takes the next word
           words++; //increment total number of words
       }
       while (text.length() < 5); //condition
       
       return words;
   }

   public static int promptUntilMatch()
   {
       Scanner s = new Scanner(System.in);
       int value = -1;
    while (value < 0 || value > 100)
    {
      System.out.println("Please enter an integer");
      value = s.nextInt();
      
      if (value > 0 && value < 100)
        {
          break; 
        }
      else
        {
          System.out.println("Integer does not meet criteria: try again");
        }
        
    }
       return value;
   }


   /*
    * Loop Algorithm #5.1: findMax
    * reads a series of numbers (ends with a letter)
    * @return the greatest number
    */
   public static int findMax() 
   {
       Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        int value2 = 0;
        int max = 0;
        
        do
        {
            System.out.print("enter an integer (a letter to quit): ");
            
            value = s.nextInt();
           
            if( max < value )
            {
                max = value;
                
            }
     
            else if(s.hasNextInt() == false)
            {
                break;
            }
        }
        while(s.hasNextInt() == true);
        return max;
   }


   /*
    * Loop Algorithm #5.2: findMin
    * reads a series of numbers (ends with a letter)
    * @return the least number
    */
   public static int findMin()
   {
       Scanner s = new Scanner(System.in);
        int value = 0;
        int value1 = -1;
        do
        {
            System.out.println("Enter a number. Enter a character to quit. ");
            value = s.nextInt();
            
            if(value < value1 || value1 == -1 )
            {
                value1 = value;
            }
        }
        while(s.hasNextInt() == true);
        System.out.println(value1);
        return value1;

   }

   /*
    * Loop Algorithm #6: Compare Adjacent Values
    * reads a series of numbers (ends with a letter)
    * if an adjacent duplicate number is entered, the loop is exited
    * @return the adjacent duplicate number that was entered
    
   public static int compareAdjacent()
   {
   }*/
}
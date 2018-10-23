import java.util.Scanner;
/**
 * Write a description of class Notes here.
 * 
 * @author mcallaghan 
 * @version 17 oct 2018
 */
public class Notes
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int) ( Math.random() * 2 );
        
        /*
         * if statement
         *      statements are executed if teh conditional expression is true
         *      conditional expression must go inside the parentheses
         *      statements are grouped by blocks (i.e. {} )
         *          not indentation like in Python
         *      no colon after the conditional expression in Java, unlke Python
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        
        /*
         * { } are not required if it's a single statement
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        
        if( coinFlip == 0 )
            System.out.println( "Coin is tails!" );   // in the if block
            System.out.println( "Better luck next time!" ); // not in the if block
            
        /*
         * if-else statement
         *      else block is executes in the conditional if teh if statement is false
        */
        if( coinFlip == 1 )
        {
            System.out.println("Coin is heads!");
   
        }
        else
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time!");
        }
        
        
        // simulate rolling a four sided die (1-4)
        int dieRoll = (int) ( Math.random() * 4 ) + 1;
        
        /*
         * if-else if-else statement in Java
         *   In Java, "else if" is used instead of "elif" like Python
         */
        if( dieRoll == 1 )
        {
            System.out.println( "rolled a 1" );
        }
        else if( dieRoll == 2 )
        {
            System.out.println( "rolled a 2" );
        }
        else if( dieRoll == 3 )
        {
            System.out.println( "rolled a 3" );
        }
        else
        {
            System.out.println( "rolled a 4" );
        }
        
       
        
        
    }
    
    public static boolean doublesAreEqual( double num1, double num2 )
        {
            /*
             * If we are using teh (==) equality operator for dobles, it will return true
             *      if the binary digits match.
             * For "equal" numbers this is probably not the case due to floating point rounding
             *      and, therefor, not what we want.
             * We will check if they are "close enough" (i.e., epsilon value)
             */
            
            final double EPSILON = 1e-14;  // 1 x 10 ^ -14
            
            if ( Math.abs( num1 - num2 ) < EPSILON )
            {
                return true;
            }
            else
            {
                return false;
            }
            
            // don't have to use an if statement when working with a boolean
            // return ( Math.abs( num1 - num2 ) < EPSILON );
            
            
        }
        
    public static void stringExample()
    {
        Scanner s = new Scanner( System.in );
        System.out.println( "Enter two strings: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if teh two values contain the same value.
         *   For objects, including Strings, this means they contain the same refernece.  That is,
         *   they contain the same object in the computer's memory, not that they have teh same 
         *   sequence of characters.
         */
        
        if( str1 == str2 )
        {
            System.out.println("strings references are equal.");
        }
        else
        {
            System.out.println("strings references are not equal.");
        }
        
        /*
         * The equals method will return true if the two objects are "equal".
         *      What equal means is defined by the class.  For strings, it means that the two objects 
         *      have the same sequence of characters.
         */
        
        if( str1.equals( str2 ))
        {
            System.out.println("strings are equal.");
        }
        else
        {
            System.out.println("strings are not equal.");
        }
        
        /*
         * We will determine which string comes first lexographically using the compareTo method
         *      of teh String class.
         *      
         * compareTo returns an int:
         *   0:  if the strings are equal (same sequence of characters)
         *   <0: if str1 < str2 lexographically
         *   >0: if str1 > str2 lexographically
         */
        
        int result = str1.compareTo(str2);
        String firstStr = null;  //no object referenced
        
        if (result < 0)
        {
            firstStr = str1;
        }
        else if (result > 0)
        {
            firstStr = str2;
        }
        
        if( firstStr != null )
        {
               System.out.println( "The first String is: " + firstStr );
        
               System.out.println( "It's length is: " + firstStr.length());
        }
        else
        {
            System.out.println("Strings are equal.");
        }
        
        /*
         * This is an example of a 'short-circuit'.
         *      If the left operancd is false, the right operand will not be evaluated
         *      because the AND operation is already false.
         */
        
        if( firstStr != null && firstStr.length() > 3 )
        {
            System.out.println("The first string has more than 3 characters.");
        }
        
        /*
         * This is another 'short-circuit example.
         *      If the left operand is true, the right operand will not even be evaluated
         *      because the OR operation will already be true.
         * This may result in a bug, if teh first word is 'kiwi' and we will never read in 
         *      the second fruit.
         */
        System.out.print("Enter your two favorite fruits.");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorite fruits too!");
        }
        
        System.out.println("Enter your favorite ice cream flavor.");
        String flavor = s.next();
        System.out.println("Favorite flavor:" + flavor);  // this could be a fruit!
        
    }
    
    
    
    
    
    
    
    
    
}
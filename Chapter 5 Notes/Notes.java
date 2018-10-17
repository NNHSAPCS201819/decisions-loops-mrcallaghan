
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
         *  In Java, "else if" is used instead of "elif" like Python
         */
        
        
        
    }
}

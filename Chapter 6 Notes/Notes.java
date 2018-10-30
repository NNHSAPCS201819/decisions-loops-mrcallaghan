
/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      evaluates a boolean expression
         *          if true, executes the body of of the loop and then re-evaluates the condition.
         *          if false, skips the body of teh loop and continues sequentially
         */
        
        int count = 1;                      // initialization
        
        while( count <= 5 )                 // condition
        {
            System.out.println(count);      // body
            count++;                        // update the condition variable
        }
        
        System.out.println("done");   
        
               
    }
    
    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         */
        int count = 1;                      // initialization
        
        while( count != 50 )                // condition
        {
            System.out.println( count );    // body
            count += 2;                     // updating the loop variable
            
        }
        System.out.println("done");
    }
    
    public static void forExample()
    {
        /*
         * for loop:
          three parts of teh for statement:
            1. initialization - executed once
            2. boolean expression - tested at the start of each iteration
            3. updating the condition variable - executed at the end
                    of each iteration before testing the condition again
         */
        
        for (int count = 1;             // initialization
             count <= 5;                // boolean condition
             count++ )                  // update the condition variable
        {
            System.out.println( count ); // body
        }
        System.out.println("done");
        
        /* 
         * variables declared within the for statement are scoped to the for statement and its body
         */
        //System.out.println("final value of count: " + count );
        
    }
    
    public static void forExample2()
    {
        int count = 1;                  // initialization
        for ( ;                         // optional to initialize in for statement
             count <= 5;                // boolean condition
              )                         // update condition is optional as well
        {
            System.out.println(count);
            count++;                    //body
        }
        System.out.println("done");
    }
    
    
    
}

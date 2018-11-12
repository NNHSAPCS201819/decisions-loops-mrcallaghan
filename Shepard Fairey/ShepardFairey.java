import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepardFairey
{
    private ColorManipulator manipulator;
    private Picture image;
    private static final Color OFF_WHITE = new Color( 248, 229, 175 );
    private static final Color LIGHT_BLUE = new Color( 121, 149, 159 );
    private static final Color RED = new Color( 198, 50, 45 );
    private static final Color DARK_BLUE = new Color( 16, 48, 77 );

    public ShepardFairey( Picture newPicture )
    {
        this.manipulator = new ColorManipulator( newPicture );
        this.manipulator.grayscale();
        this.image = this.manipulator.getPicture();
    }
    
    public Picture getPicture()
    {
        return this.image;
    }
    
    public static Color getOffWhite()
    {
        return ShepardFairey.OFF_WHITE;
    }
    
    public static Color getLightBlue()
    {
        return ShepardFairey.LIGHT_BLUE;
    }
    
    public static Color getRed()
    {
        return ShepardFairey.RED;
    }
    
    public static Color getDarkBlue()
    {
        return ShepardFairey.DARK_BLUE;
    }

    /**
     * Transforms the picture by applying a Shepard Fairey-inspired effect.
     *
     */
    public void transform()
    {
        int width = this.image.getWidth();
        int height = this.image.getHeight();
        int smallestGray = 255;
        int largestGray = 0;
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                Pixel pixel = this.image.getPixel( x, y );
                Color color = pixel.getColor();
                
                int red = color.getRed();
                if(red < smallestGray)
                {
                    smallestGray = red;
                }
                if(red > largestGray)
                {
                    largestGray = red;
                }
            }
        }
        
        this.image = this.manipulator.posterize(image, smallestGray, largestGray, 4);
        
        
    }

    public static void main(String args[])
    {
        // create a new picture object based on the original selfie
        //  (the selfie image must be in the Shepard Fairey folder)
        Picture selfie = new Picture( "selfieLandscape.jpg" );

        // create a ShepardFairey object to transform the selfie picture
        ShepardFairey fairey = new ShepardFairey( selfie );

        // display the original selfie picture
        selfie.explore();

        // transform the selfie picture by applying a Shepard Fairey-inspired effect
        fairey.transform();

        // save the transformed selfie picture
        Picture newSelfie = fairey.getPicture();
        newSelfie.explore();
        
        /* This code doesn't work for some students for unknown reasons.
         * You may need to specify an absolute path. For example:
         *  finalPic.write("C:\\Users\\gschmit\\GitHub\\decisions-loops-gcschmit\\Shepard Fairey\\MrSchmitPortrait.jpg");
         */
        selfie.write( "C:\\Users\\mcallaghan\\GitHub\\decisions-loops-mrcallaghan\\Shepard Fairey\\MrCalShepardFairey.jpg" );
        
        // repeat the steps for the selfie in landscape orientation
        //selfie = new Picture( "selfieLandscape.jpg" );
        //fairey = new ShepardFairey( selfie );
        //selfie.explore();
        //fairey.transform();
        //selfie.write( "MrCallaghanLandscape.jpg" );

        // display the transformed selfie picture
        //selfie.explore();
    }
}
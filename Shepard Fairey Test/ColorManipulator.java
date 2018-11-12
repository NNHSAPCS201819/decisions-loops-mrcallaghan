import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author gcschmit
 * @version 5 June 2017
 */
public class ColorManipulator
{
    private Picture picture;

    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }
    
    public Picture getPicture()
    {
        return this.picture;
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 );
            }
        }
    }
    
    /**
     * Sets the red component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxRed()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setRed( 255 );
            }
        }
    }
    
    /**
     * Sets the green component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxGreen()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setGreen( 255 );
            }
        }
    }

    /**
     * Negates the color of every pixel in the picture
     *
     *      An example of manipulating the color of a pixel using a Color object
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();
                
                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }
    
    /**
     * Converts a picture object to grayscale
     */
    public void grayscale()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int grayValue = (int)(( color.getRed() + color.getBlue() + color.getGreen() ) / 3.0);
                
                Color grayColor = new Color( grayValue, grayValue, grayValue );
                pixel.setColor( grayColor );
            }
        }
    }
    
    public Picture posterize(Picture pic, int minGray, int maxGray, int numSubranges)
    {
        int grayRange = maxGray - minGray;
        double graySubrangeLength = grayRange / (double)numSubranges;
        double rangeBreakpoint1 = minGray + graySubrangeLength;
        double rangeBreakpoint2 = rangeBreakpoint1 + graySubrangeLength;
        double rangeBreakpoint3 = rangeBreakpoint2 + graySubrangeLength;
        
        int width = pic.getWidth();
        int height = pic.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = pic.getPixel( x, y );
                Color color = pixel.getColor();
                
                int grayValue = (int)(( color.getRed() + color.getBlue() + color.getGreen() ) / 3.0);
                
                if(grayValue < rangeBreakpoint1)
                {
                    Color dBlue = ShepardFairey.getDarkBlue();
                    pixel.setColor( dBlue );
                }
                else if(grayValue < rangeBreakpoint2)
                {
                    Color red = ShepardFairey.getRed();
                    pixel.setColor( red );
                    
                }
                else if(grayValue < rangeBreakpoint3)
                {
                    Color lBlueColor = ShepardFairey.getLightBlue();
                    pixel.setColor( lBlueColor );
                }
                else
                {
                    Color whiteColor = ShepardFairey.getOffWhite();
                    pixel.setColor( whiteColor );
                    
                }
                
            }
        }
        return pic;
    }

    public static void main(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "selfieLandscape.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.maxBlue();
        picture.explore();
    }
}

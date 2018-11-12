import java.awt.Color;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tests the grayscale method
     */
    @Test
    public void testGrayscale()
    {
        Picture picture= new Picture( "selfieLandscape.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.grayscale();
        Picture newPicture = manipulator.getPicture();
        Pixel pix = newPicture.getPixel(840, 422);
        double avg = pix.getAverage();
        Pixel pix2 = newPicture.getPixel(824, 485);
        double avg2 = pix2.getAverage();
        assertEquals( 216, avg2, 1e-6 );
        
        
    }
}

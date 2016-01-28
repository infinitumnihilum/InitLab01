package davis.john.initlab01;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jrdavis on 1/27/16.
 */
public class ColorFulthingSpec {


    @Test
    public void getColorTest(){

        ColorfulThing y = new ColorfulThing("red");



        assertEquals("Test to see if color is correct",y);
    }

}

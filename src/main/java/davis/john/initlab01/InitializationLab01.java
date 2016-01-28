package davis.john.initlab01;

import java.awt.*;

/**
 * Created by jrdavis on 1/27/16.
 */
public class InitializationLab01 {

    public static void main(String[] args) {
        BoringThing b1 = new BoringThing();
        BoringThing b2 = new BoringThing();
        BoringThing b3 = new BoringThing();
        BoringThing b4 = new BoringThing();
        BoringThing b5 = new BoringThing();


        ColorfulThing c1 = new ColorfulThing("Red \n");
        ColorfulThing c2 = new ColorfulThing("Blue\n");
        ColorfulThing c3 = new ColorfulThing("Green\n");
        ColorfulThing c4 = new ColorfulThing("Orange\n");
        ColorfulThing c5 = new ColorfulThing("Black\n");

        System.out.println(c1.getColor() + c2.getColor() + c3.getColor() + c4.getColor() + c5.getColor() );


    }


}

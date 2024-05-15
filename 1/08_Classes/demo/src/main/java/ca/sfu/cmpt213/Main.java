package ca.sfu.cmpt213;

import java.util.ArrayList;
import java.util.List;

import ca.sfu.cmpt213.rectangle.Rectangle;
// import ca.sfu.cmpt213.ui.UI;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Rectangle r1 = new Rectangle(4.0, 15.0);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(10.0, 6.0);
        System.out.println(r2);
        System.out.println(r1.equals(r2));
        System.out.println(Rectangle.getTotalRectangles());

        List<Rectangle> boxes = new ArrayList<>();
        boxes.add(r1);
        boxes.add(r2);
        boxes.remove(0); 
        for (Rectangle r : boxes) {
            System.out.println(r);
        }

       
        
        
        
    }
}

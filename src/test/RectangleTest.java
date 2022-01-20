package test;

import com.company.Rectangle;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void newRectangle_instantiateCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangleGetLength_2(){
        Rectangle rectangle = new Rectangle(2,4);
        assertEquals(2, rectangle.getLength());
    }

    @Test
    public void newRectangleGetWidth_4(){
        Rectangle testRectangle = new Rectangle(2,4);
        assertEquals(4, testRectangle.getWidth());
    }

    @Test
    public void isSquare_WhenNotASquare_false(){
        Rectangle testRectangle = new Rectangle(2,4);
        assertEquals(false, testRectangle.isSquare());
    }

    @Test
    public void isSquare_allSidesEqual_true(){
        Rectangle testRectangle = new Rectangle(2,2);
        assertEquals(true, testRectangle.isSquare());
    }
}































































































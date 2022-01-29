package MathRelated;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfSquaresTest extends PowerOfSquares
{

    @Test
    public void integerPower()
    {

        assertEquals(27,IntegerPower(3,3));
        assertEquals(4,IntegerPower(2,2));
        assertEquals(1,IntegerPower(2,0));
        assertEquals(0.5 , IntegerPower(2,-1));
        assertEquals(1,IntegerPower(2,2)*IntegerPower(2,-2));
        assertEquals(1,IntegerPower(10,10)*IntegerPower(10,-10),0.1);

    }

    @Test
    public void squareTest()
    {
        Square(4,'#');
        Square(10,'a');
        Square(5,'v');
        Square(1,'c');
        Square(6,'s');
        Square(2,'o');
        Square(2,'p');
        Square(8,'l');
        Square(9,'i');

    }

    @Test
    void RectangleTest()
    {
        Rectangle(10,20,'c');
        Rectangle(10,20,'#');
        Rectangle(10,20,'@');
        Rectangle(10,20,'*');
        Rectangle(10,20,'A');
    }

   @Test
    public void sortarrayTest()

    {
        int[] array = new int[10];
        int[] hypothesis = {1,2,3,4,5,6,7,8,9,10};
        int filler = array.length;
        for(int i =array.length-1; i >=0; i--)
        {
            array[i] = filler;
            filler--;

        }
        sortarray(array);
        for(int i = 0; i < hypothesis.length; i++)
        {
            assertEquals(hypothesis[i] , array[i]);
        }

    }
}

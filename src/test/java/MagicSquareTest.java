import org.junit.Before;
import org.junit.Test;
import service.MagicSquareService;

import static org.junit.Assert.assertEquals;

public class MagicSquareTest {

    private MagicSquareService service;


    @Before
    public void setup(){
        service = new MagicSquareService();
    }

    @Test
    public void testMagicSquare(){
        int [][] square = service.generateMagicSquare(3);

        assertEquals(square[0][0] + square[0][1] + square[0][2], square[1][0] + square[1][1] + square[1][2]);
        assertEquals(square[2][0] + square[2][1] + square[2][2], square[1][0] + square[1][1] + square[1][2]);
        assertEquals(square[0][0] + square[0][1] + square[0][2], square[2][0] + square[2][1] + square[2][2]);
    }
}

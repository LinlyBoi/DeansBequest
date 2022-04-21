package FindPathsPls;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPathsMatrixTest
{


    @Test
    void getColumn()
    {
        int[][] M1 =
            {
                    {1, 2, 3},
                    {3, 4, 5},
                    {6, 7, 8}
            };
        assertEquals(Arrays.toString(new int[]{1, 3, 6}), Arrays.toString(FindPathsMatrix.getColumn(M1,0)));
    }

    @Test
    void getRow()
    {
        int[][] M1 =
            {
                    {1, 2, 3},
                    {3, 4, 5},
                    {6, 7, 8}
            };

        assertEquals(Arrays.toString(new int[]{1, 2, 6}), Arrays.toString(FindPathsMatrix.getRow(M1,0)));
    }

    @Test
    void RowMultiplyColumn()
    {
        int[][] M1 =
            {
                    {1, 2, 3},
                    {3, 4, 5},
                    {6, 7, 8}
            };
        assertEquals(25,FindPathsMatrix.RxC(FindPathsMatrix.getRow(M1,0),FindPathsMatrix.getColumn(M1,0)));
    }
}
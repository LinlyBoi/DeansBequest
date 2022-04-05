package FindPathsPls;

import java.util.Arrays;

public class FindPathsMatrix
{
  public static void main(String[] args)
  {
    int[][] M1 =
            {
                    {1, 2, 3, 4},
                    {3, 4, 5, 6},
                    {6, 7, 8, 10},
                    {2, 5, 2, 8}
            };
    GetPaths(M1,3);
  }
  public static void GetPaths(int[][] M, int length)
  {
    int count = 2;
    int[][] output = M;
    while(count <= length) {

      output = MultiplyMatrix(output, M);
      assert output != null;
      count++;
    }
    for (int[] ints : output) System.out.println(Arrays.toString(ints));


  }

  public static int[][] MultiplyMatrix(int[][] M1, int[][] M2)
  {
    if(M1.length == M2[0].length)
    {
      int[][] output = new int[M1.length][M1.length];
      for (int i = 0; i < M1.length; i++)
      {
        int[] R = getRow(M1, i);
        for (int j = 0; j < M2.length; j++)
        {
          int[] C = getColumn(M2, j);
          output[i][j] = RxC(R, C);
        }
      }
      return output;
    }
    else
      return null;
  }

  public static int[] getColumn(int[][] input , int index)
  {
    int[] output = new int[input.length];
    for(int i = 0; i < input.length; i++)
      output[i] = input[i][index];
    return output;
  }

  public static int[] getRow(int[][] input , int index)
  {
    return input[index];
  }

  public static int RxC(int[] R , int[] C)
  {
    int output = 0;
    int temp;
    for (int i = 0; i < R.length ; i++)
    {
      temp = R[i] * C[i];
      output += temp;
    }
    return output;
  }
}

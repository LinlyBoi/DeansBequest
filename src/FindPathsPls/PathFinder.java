package FindPathsPls;

import java.util.ArrayList;
import java.util.Arrays;

public class PathFinder
{
    public static void main(String[] args)
    {
        ArrayList<String[]> Graph = new ArrayList<>();
        Graph.add(new String[]{"", "e1", "e3"});
        Graph.add( new String[]{"e1", "", "e2"});
        Graph.add( new String[]{"e3", "e2", ""});
        GetPaths(Graph,3,3,2);
        ArrayList<String[]> ExtremeGraph = new ArrayList<>();
        ArrayList<String[]> Graph2 = new ArrayList<>();
        Graph2.add(new String[]{"", "e1,e2,e3", "e3,e4"});
        Graph2.add( new String[]{"e1,e2,e3", "", "e6"});
        Graph2.add( new String[]{"e3,e4", "e6", ""});
        GetPaths(Graph2,3,3,2);

    }
    private static void GetPaths(ArrayList<String[]> Graph , int row_len, int col_len, int path_len)
    {
        int power =2;
        int count = 0;
        if(path_len == 2)
        {
            ArrayList<String[]> output = SquareMatrix(Graph, row_len, col_len);
            for(int i = 0; i < output.size();i++)
            {
                count++;
                System.out.print(Arrays.toString(output.get(i))+"  ,  ");
                if(count % 3 == 0)
                    System.out.println();
            }
        }
        else
        {
            ArrayList<String[]> output = Graph;

            while(power <= path_len)
            {
                output = MultiplyMatrix(output, Graph, row_len, col_len);
                power++;
            }
            for(int i = 0; i <= output.size();i++)
            {
                count++;
                System.out.print(Arrays.toString(output.get(i)));
                if((count % 3) == 0)
                    System.out.println();
            }

        }
    }


    private static ArrayList<String[]> MultiplyMatrix(ArrayList<String[]> M1, ArrayList<String[]> M2, int row_len, int col_len)
    {
        return MatrixMultiplication(M1, M2, row_len, col_len);
    }

    private static ArrayList<String[]> MatrixMultiplication(ArrayList<String[]> M1, ArrayList<String[]> M2, int row_len, int col_len)
    {
        String[] R;
        String[] C;
        ArrayList<String[]> output = new ArrayList<>();
        for(int rows = 0; rows < row_len; rows++)
        {
            R = getRow(M1,rows);

            for (int cols = 0; cols < col_len; cols++)
            {
                C = getColumn(M2, cols);
                output.add(findCart(R, C));
            }
        }
        return output;
    }


    private static ArrayList<String[]> SquareMatrix(ArrayList<String[]> input, int row_len, int col_len)
    {
        return MatrixMultiplication(input, input, row_len, col_len);

    }

    public static String[] findCart(String[] arr1, String[] arr2)
    {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr1)
            for (String value : arr2)
            {
                if (!(s.equals("") || value.equals("")))
                {
                    list.add(s + "->" + value);
                }

            }
        String[] arr = new String[list.size()];

        return list.toArray(arr);
    }

    public static String[] getColumn(ArrayList<String[]> input , int index)
    {
        String[] output = new String[input.size()];
        for(int i = 0; i < input.size(); i++)
        {
            if(input.get(i) != null)
            output[i] = input.get(i)[index];
        }
        return output;

    }


    public static String[] getRow(ArrayList<String[]> input , int index)
    {
        return input.get(index);
    }
}

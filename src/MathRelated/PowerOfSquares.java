package MathRelated;

public class PowerOfSquares
{
    public int IntegerPower(int base, int power)
    {

        if(power == 0)
        return 1;

        else
        {
            int count = 0;
            while (count <= power)
            {
                base = base * base;
            }
            return base;
        }
        /* else //unlucky this is not required scammed
        {
            int count = -power;
            while(count <= power)
            {
                base = base / base;
            }
        }

         */
    }

    public static void Square(int side , char c)
    {
        for (int i = 0; i < side; i++)
        {
            for (int j = 0; j < side; j++)
            {

                System.out.print(c);
            }
            System.out.print("\n");

        }
    }
    public static void Rectangle(int length , int width , char c)
    {
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < width; j++)
            {

                System.out.print(c);
            }
            System.out.print("\n");

        }
    }
        public static void sortarray(int[] array)
        {
            int count = 0;
            while(count < array.length)
            {
                for (int i = 0; i < array.length; i++)
                {
                    if(i < array.length -2)
                    {

                        if (array[i] > array[i+1])
                            swap(i,i+1,array);
                        count++;
                    }
                }
            }

        }
        public static void swap(int a , int b, int[] array)
        {
            int temp = 0;
            array[a] = temp;
            array[a] = array[b];
            array[b] = temp;

        }



}

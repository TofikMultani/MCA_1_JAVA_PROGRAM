import java.util.*;
class SecondLargestSmallest_Array_2d
{
    static
    {
        System.out.println("TOFIK MULTANI");
        System.out.println("MCA");
        System.out.println("Roll : 35");
    }
    public static void main(String[] args)
    {
        int[] a = { 15, 6, 5, 300, 1, 28, 10, 55, 75, 56 };
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        int smin = Integer.MAX_VALUE, smax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < smin && a[i] != min)
            {
                smin = a[i];
            }
            if (a[i] > smax && a[i] != max)
            {
                smax = a[i];
            }
        }
        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
        if (smax == Integer.MIN_VALUE)
            System.out.println("Second Max not found");
        else
            System.out.println("Second Max: " + smax);
        if (smin == Integer.MAX_VALUE)
            System.out.println("Second Min not found");
        else
            System.out.println("Second Min: " + smin);
    }
}
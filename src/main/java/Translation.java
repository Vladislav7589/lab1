
import java.util.Scanner;


/** This class is designed to convert a number in decimal notation to decimal.
 * @author Vlad
 */
public class Translation {
    /**
     * Length of a binary number.
     */
    private static int size_num;

    /**
     * @param num A number in decimal notation.
     * @return  Returns an array with an inverted number in binary.
     */
    static int[] func(int num) {
        int i=1;
        int num_2[] = new int[100];
        while(num != 0)
        {
            num_2[i++] = num%2;
            num = num/2;
        }
         size_num = i;
        return num_2;
    }
    public static void main(String args[])
    {
        int num_10;
        int rezult[];
        Scanner in = new Scanner(System.in);


        System.out.print("Введите десятичное число: ");
        num_10 = in.nextInt();

        rezult = func(num_10) ;
        System.out.print("Число в 2-чной с-ме счисления: ");
        for(int j = size_num - 1; j > 0; j--) System.out.print(rezult[j]);

        System.out.print("\n");
    }
}

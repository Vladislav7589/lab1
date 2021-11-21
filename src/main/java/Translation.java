
import com.sun.deploy.util.StringUtils;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
        int i = 232;
//число 232 в двоичной системе
        System.out.println(Integer.toBinaryString(i));
//обратыный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("11101000", 2));

        System.out.print("Введите десятичное число: ");
        num_10 = in.nextInt();

        rezult = func(num_10) ;
        System.out.print("Число в 2-чной с-ме счисления: ");
        for(int j = size_num - 1; j > 0; j--) System.out.print(rezult[j]);
        System.out.print("\n");
        int[] largerArray = new int[size_num-1];
        System.arraycopy(rezult, 1, largerArray, 0, size_num-1);

        int temp;

        for (int t = 0; t < largerArray.length/2; t++) {
            temp = largerArray[largerArray.length-t-1];
            largerArray[largerArray.length-t-1] = largerArray[t];
            largerArray[t] = temp;
        }
        String[] a = Arrays.toString(largerArray).split("[\\[\\]]")[1].split(", ");
        String arrayToString = Arrays.stream(a).collect(Collectors.joining());


        System.out.println(Integer.parseInt(arrayToString, 2));

        System.out.print("\n");
    }
}

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TranslationTest {

    static int[] func(int num) {
        int i=1;
        int[] num_2 = new int[6];
        while(num != 0)
        {
            num_2[i++] = num%2;
            num = num/2;
        }
        int size_num = i;
        return num_2;
    }

    @Test
    public void Test()
    {
        new TranslationTest();
        Assertions.assertArrayEquals(TranslationTest.func(5), new int[]{0, 1, 0, 1, 0, 0});
    }

}
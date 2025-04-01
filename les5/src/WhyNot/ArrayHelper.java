package WhyNot;


import java.math.BigDecimal;
import java.util.Random;

public class ArrayHelper {
    private BigDecimal[] integers;
    private ArrayHelper(int size){
        integers = new BigDecimal[size];
    }
    public static ArrayHelper newInstance(int size){
        return new ArrayHelper(size);
    }
    public static ArrayHelper newInstance(int size, int min, int max){
        Random rand = new Random();
        ArrayHelper helper = new ArrayHelper(size);
        for (int i = 0; i < size; i++){
            helper.integers[i] = BigDecimal.valueOf(rand.nextInt(min, max));
        }
        return helper;
    }
    void getMax(ArrayHelper array){
        for (int i = 0; i < integers.length; i++){
            System.err.println("4");
        }
    }
    void getMin(ArrayHelper array){

    }
}

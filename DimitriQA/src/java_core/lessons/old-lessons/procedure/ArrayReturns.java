package java_fundamentals.lessons.procedure;
import java.util.Arrays;

public class ArrayReturns {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayFilling(new int[]{22, 4, 11114}, new int[]{67, 3454, 16})));
        System.out.println("Поздравляю, получилось!");
    }



    public static int[] arrayFilling (int[] getArray1,int[] getArray2){
        int[] arrayResult= new int[getArray1.length+ getArray2.length];
        for (int i = 0; i < getArray1.length; i++) {
            arrayResult[i] = getArray1[i];
            for (int j = 0; j < getArray2.length; j++) {
                arrayResult[getArray1.length+j]=getArray2[j];
            }
            }
        return arrayResult;

    }
}

package Homework;
import java.util.stream.IntStream;

public class LargestEvenNo {
    public static void main(String[] args) {
        int largesteven = IntStream.of(5,-1,12,10,2,8)
                .filter(n-> n%2==0)
                .max()
                .getAsInt();
        System.out.println(largesteven);
    }

}

package Stream;
import java.util.stream.IntStream;
public class LargestNum {
    // TODO Auto-generated method stub
    // print largest multiple of 10 in list
    // (this version compiles and works.)
    int largest =
            IntStream.of(55, 20, 19, 31, 40, -2, 62, 30)
                    .filter(n -> n % 10 == 0)
                    .max()
                    .getAsInt();
        System.out.println(largest);
}

package Stream;
import java.util.Arrays;
import java,.util.collectors;
import java.util.set;
import java.util.list;
public class ConvertTLowCase {
    public static void main(String[] args) {
        // convert into set of lowercase words
        List<String> words = Arrays.asList(
                "To", "be", "or", "Not", "to", "be");
        Set<String> words2 = words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println("word set = " + words2);
    }
}

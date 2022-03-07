package Stream;
import java.io.*;
public class LongestLFilesPath {
    public static void main(String[] args) {
        // find longest line in the file
        int longest = Files.lines(Paths.get("haiku.txt"))
                .mapToInt(String::length)
                .max()
                .getAsInt();

       /* stream operations:
        Files.lines -> ["haiku are funny",
                "but sometimes they don't make sense",
                "refrigerator"]
-> mapToInt -> [15, 35, 12]
     -> max -> 35*/
    }
}

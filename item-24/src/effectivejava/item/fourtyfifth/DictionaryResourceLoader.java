package effectivejava.item.fourtyfifth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryResourceLoader {
    static void loadGroupAndPrintDict(String filePath, int minGroupSize)
            throws IOException {
        Path path = Paths.get(filePath);
        try (Stream<String> words = Files.lines(path)) {
            words.collect(Collectors.groupingBy(word -> alphabetize(word)))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> System.out.println(g.size() + ":" + g));
        }
    }

    static String alphabetize(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}

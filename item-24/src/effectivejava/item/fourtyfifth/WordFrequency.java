package effectivejava.item.fourtyfifth;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class WordFrequency {
    public static void wordFrequency(File file) throws FileNotFoundException {
        Map<String, Long> freq;
        try (Stream<String> stream = new Scanner(file).tokens()) {
            freq = stream.collect(groupingBy(String::toLowerCase, counting()));
            freq.keySet().stream()
                    .sorted(Comparator.comparing(freq::get).reversed())
                    .limit(10).collect(toSet()).forEach(System.out::println);
        }
    }
}

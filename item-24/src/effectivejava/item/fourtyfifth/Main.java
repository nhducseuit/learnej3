package effectivejava.item.fourtyfifth;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Effective Java - Item number 45");
        String userDir = System.getProperty("user.dir");
        String resourcePath = userDir + File.separator + "resource" + File.separator;
        /*String dictionaryFilePath = System.getProperty("user.dir")
                + File.separator + "resource" + File.separator
                + "Vietnamese_vi_VN.dic.txt";
        DictionaryResourceLoader.loadGroupAndPrintDict(dictionaryFilePath, 4);*/
        
        /*Primes.firstTwentyPrimes();*/
        
        /*CartesianProduct.cardDeck();*/
        
        /*WordFrequency.wordFrequency(new File(resourcePath + "word_frequency.txt"));*/
        
        
        System.exit(0);
        
    }
}

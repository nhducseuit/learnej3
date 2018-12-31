package effectivejava.item.fourtyeighth;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class PrimeCounting {

    public static void pi(long n) {
        LongStream.rangeClosed(2, n)
            .mapToObj(BigInteger::valueOf)
            .filter(i -> i.isProbablePrime(50))
            .count();
    }
    
    public static void piParallel(long n) {
        LongStream.rangeClosed(2, n)
            .parallel()
            .mapToObj(BigInteger::valueOf)
            .filter(i -> i.isProbablePrime(50))
            .count();
    }
}

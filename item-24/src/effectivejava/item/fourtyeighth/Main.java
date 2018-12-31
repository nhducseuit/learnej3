package effectivejava.item.fourtyeighth;

public class Main {

    public static void main(String[] args) {
        long startExecutionTimeMillis = System.currentTimeMillis();
//        PrimeCounting.pi((long) Math.pow(10, 8));
        PrimeCounting.piParallel((long) Math.pow(10, 8));
        long endExecutionTimeMillis = System.currentTimeMillis();
        System.out.println("Counting time = " + (endExecutionTimeMillis - startExecutionTimeMillis) + "ms");
    }

}

package tom.sales.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreamsTest01 {
    public static void main(String[] args) {
        // Java abstraiu a complicação de trabalhar com paralelismo utilizando Parallel Streams
        long num = 10_000_000;
        sumFor(num);

        System.out.println("------");
        sumStreamIterate(num);

        System.out.println("------");
        sumParallelStreamIterate(num); // Nesse caso não melhora a perfomance, threads não sabem o tamanho do intervalo

        System.out.println("------");
        sumLongStreamIterate(num);

        System.out.println("------");
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 0; i <= num; i++) {
            result = result + i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum Parallel Stream Iterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum Long Stream Iterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum Parallel Long Stream Iterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}

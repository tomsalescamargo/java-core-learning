package tom.sales.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class GeneratingStreamsTest02 {
    public static void main(String[] args) {
        // ITERATE
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("-----------");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);



        System.out.println("--------------");
        ThreadLocalRandom random = ThreadLocalRandom.current();

        // GENERATE
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(10)
                .forEach(System.out::println);
    }
}

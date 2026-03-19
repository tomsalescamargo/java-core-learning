package tom.sales.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneratingStreamsTest01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();


        Stream<String> animalsStream = Stream.of("Elefante", "Girafa", "Macaco", "Baleia", "Golfinho");
        animalsStream
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();


        int[] nums = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(nums);
        System.out.println(intStream.sum());

        System.out.println("---------------");

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines
                    .filter(l -> l.contains("Java"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

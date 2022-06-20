package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {

    public static void main(String[] args) {
        // 스트림 생성
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::print); // 최종 연산, 스트림 닫힘

        intStream = list.stream(); // 다시 사용할 경우 새로 생성해 줘야함
        intStream.forEach(System.out::print);

        System.out.println();

        // 배열
        Stream<String> strStream1 = Stream.of("a", "b", "c");
        strStream1.forEach(System.out::println);

        String[] strArr = {"a", "b", "c", "d"}; // new String[] 생략 가능
        Stream<String> strStream2 = Stream.of(strArr);
//        Stream<String> strStream2 = Stream.of(new String[] {"a", "b", "c", "d"}); // 직접 넣어줄 떄는 생략 불가능
        strStream2.forEach(System.out::println);

        Stream<String> strStream4 = Arrays.stream(strArr);
        strStream4.forEach(System.out::println);

        // 기본형 스트림
        // 오토박싱, 언박싱이 필요 없어 더 효율적이고 추가적인 메서드가 있다.
        // intStream 의 경우 sum, average

        // 무한 스트림
        IntStream intStream1 = new Random().ints(); // 무한 스트림
        intStream1
                .limit(5) // 개수 지정
                .forEach(System.out::println);

        IntStream intStream2 = new Random().ints(5); // 개수 지정
        intStream2
                .forEach(System.out::println);

        IntStream intStream3 = new Random().ints(5, 10); // 범위 지정
        intStream3
                .limit(5)
                .forEach(System.out::println);

        IntStream intStream4 = new Random().ints(10, 5, 10); // 범위, 개수 지정
        intStream4
                .forEach(System.out::println);

        // 람다식
        // iterate(T seed, UnaryOperator f) : 단항 연산자
        Stream<Integer> intStream5 = Stream.iterate(0, n -> n + 2);
        intStream5
                .limit(10)
                .forEach(System.out::println);

        // generate(Supplier s) : 주기만 하는 것
        Stream<Integer> intStream6 = Stream.generate(() -> 1);
        intStream6
                .limit(10)
                .forEach(System.out::println);

        // 파일을 읽어와 스트림 생성 가능, 빈 스트림 생성 가능
    }

}

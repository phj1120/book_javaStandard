package ch12;

// 열거형 생성
//                0     1      2     3
enum Direction {EAST, SOUTH, WEST, NORTH}

public class Ex12_5 {
    public static void main(String[] args) {
        // 열거형 값 가져오기
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // 열거형 값 비교
        System.out.println("(d1==d2) = " + (d1 == d2));
        System.out.println("(d1==d3) = " + (d1 == d3));
        System.out.println("(d1.equals(d3)) = " + (d1.equals(d3)));
//        System.out.println("(d1 > d3) = " + (d1 > d3)); // 비교 연산 불가 -> 열거형 상수가 객체이기 때문에
        System.out.println("(d1.compareTo(d3)) = " + (d1.compareTo(d3)));
        System.out.println("(d1.compareTo(d2)) = " + (d1.compareTo(d2)));


        Direction[] dArr = Direction.values();

        for (Direction d : dArr) {
            System.out.print("d.name() = " + d.name());
            System.out.println(" / d.ordinal() = " + d.ordinal()); // 상수가 선언 된 순서
        }
    }
}

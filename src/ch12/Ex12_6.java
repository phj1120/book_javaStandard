package ch12;

public class Ex12_6 {

    public static void main(String[] args) {
        for (Direction2 d : Direction2.values()) {
            System.out.print("d.name() = " + d.name()); // 이름
            System.out.print(" / d.ordinal() = " + d.ordinal()); // 순서
            System.out.print(" / d.getValue = " + d.getValue()); // 선언한 값 : value
            System.out.println(" / d.getSymbol() = " + d.getSymbol()); // 선언한 값 : symbol
        }
    }

}

enum Direction2 {

    EAST(1, ">"), SOUTH(2, "v"), WEST(3, "<"), NORTH(4, "^");

    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

}



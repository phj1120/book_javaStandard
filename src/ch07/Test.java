package ch07;

import java.util.ArrayList;

class Product {
}
class Tv extends Product{
    public void turnOff(){
        System.out.println("Tv OFF");
    }
}

public class Test {
    public static void main(String[] args) {
//        다운 캐스팅 // https://mommoo.tistory.com/51
//        밑도 끝도 없이 다운캐스팅 불가능
//        Tv tv1 = (Tv) new Product(); // ClassCastExceptio
//        tv1.turnOff();

//        업캐스팅 된 것을 다시 원상태로 돌리는 것.
        Product product = new Tv();
        Tv tv = (Tv) product;
        tv.turnOff();
    }
}

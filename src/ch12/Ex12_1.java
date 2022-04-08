package ch12;

import java.util.ArrayList;

class Product{
    public void turnOff() {
        System.out.println("Product OFF");
    }
}

class Tv extends Product {
    @Override
    public void turnOff() {
        System.out.println("Tv OFF");
    }
}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
//        ArrayList<Product> productList2 = new ArrayList<Tv>(); // 에러, 데이터 타입 일치해야 함

//        public boolean add(E e) 로 선언 되어 타입에 맞게 변환 된다.
        productList.add(new Product()); // public boolean add(Product e)
        productList.add(new Tv()); // public boolean add(Tv e)

        Product p = productList.get(0);
        Tv t = (Tv) productList.get(1); // 업캐스팅 후 다운 캐스팅 가능

        p.turnOff(); // Product OFF
        t.turnOff(); // Tv OFF

//        업캐스팅, 다운 캐스팅
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        tvList.add(new Tv());
//        tvList.add(new Product());

        Tv tv = tvList.get(0);
        Product productTv = tvList.get(0); // 업캐스팅(Tv -> Product)
        Tv downTv = (Tv) productTv; // 다운 캐스팅(Product -> Tv)

        tv.turnOff(); // Tv OFF
        productTv.turnOff(); // Tv OFF
        downTv.turnOff(); // Tv OFF
    }
}

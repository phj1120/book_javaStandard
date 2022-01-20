import java.util.ArrayList;

class Tv{}
class Audio{}

public class GenericTest {
//    지네릭스 사용 X
//    다른 타입이 들어올 경우
//    컴파일 O, 실행 X
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.add(20);
//        list.add("String");
//
////        Object o = list.get(1);
//        Integer integer = (Integer) list.get(2);
//
//        System.out.println("integer = " + integer);
//    }

//  지네릭스 사용
//    다른 타입이 들어올 경우
//    컴파일 에러 발생
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(20);
////        list.add("String");
//
//        Integer integer = list.get(1);
//
//        System.out.println("integer = " + integer);
//    }

// 지네릭 타입 변수
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); // 기본적으로 타입 변수가 같아야함
        list.add(new Tv());
//        list.add(new Audio()); // TV 객체만 저장 가능
    }
}

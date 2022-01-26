package ch6;

class Tv{
    int channel;

    void channelDown() { channel--; }
    void channelUp() { channel++; }
}

public class Hello3 {
    public static void main(String[] args) {
        System.out.println("hello3");
        
        Tv t;
        t = new Tv();

        System.out.println("t = " + t);
        System.out.println("t.channel = " + t.channel);
    }
}

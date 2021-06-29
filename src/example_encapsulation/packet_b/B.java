package example_encapsulation.packet_b;

import example_encapsulation.packet_a.A;

public class B{
    public static void main(String[] args) {
        A aa = new A();
       // aa.phuongThucDefault();
        aa.phuongThucPublic();
       // aa.phuongThucProtected();
    }
}

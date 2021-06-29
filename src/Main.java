import example_encapsulation.packet_a.A;
import example_encapsulation.packet_a.A2;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A2 a2 = new A2();//goi mac dinh A()
        A2 a22 = new A2(5);//goi A(int x) vi co super()
        a2.phuongThucPublic();
        System.out.println("Ep kieu");
        A a1 = new A2();
    }
}

package example_encapsulation.packet_a;

public class A2 extends A {
    public A2(){
        // new A()
        System.out.println("Constructor 1 A2");
    }
    public A2(int x){
        // new A()
        super(1);//new A(x1)
        System.out.println("Constructor 2 A2");
    }

    @Override
    public void phuongThucPublic() {
        super.phuongThucPublic();//~A.phuongThucPublic()
        System.out.println("phuongThucPublic A2");
    }
}

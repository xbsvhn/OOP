package example_encapsulation.packet_a;

public class A {
    int thuocTinhDefault;
    public int thuocTinhPublic;
    private int ThuocTinhPrivate;
    protected int ThuocTinhProtected;
    public A(){
        System.out.println("constructor 1 A");
    }
    public A(int x){
        System.out.println("constructor 2 A");
    }
    void phuongThucDefault(){
        System.out.println("phuongThucDefault A");

    }
    public void phuongThucPublic(){
        System.out.println("phuongThucPublic A");
    }
    private void phuongThucPrivate(){
        System.out.println("phuongThucPrivate A");
    }
    protected void phuongThucProtected(){
        System.out.println("phuongThucProtected A");
    }
}

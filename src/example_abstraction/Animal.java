package example_abstraction;
//class Animal co the lam gi
interface anUong{                 //interface chi co phuong thuc lhong co thuoc tinh
    void an();
    void uong();
}

//class Animal la gi//khong the tao new Animal()
public abstract class Animal implements anUong {
    int soChan;
    void phuongThuc1(){

    }
    abstract void dichuyen (int x, int y);//ham abstract khong co body,
}


    class conLon extends Animal{
    public conLon(){
        this.soChan = 4;
    }
// bat buoc phai ghi de doi voi abtract
        @Override
        void dichuyen(int x, int y) {
            System.out.println("Con Lon di chuyen");

        }

        @Override
        public void an() {
            System.out.println("Con Lon an cam");

        }

        @Override
        public void uong() {
            System.out.println("Con Lon uong nuoc ao");

        }
    }


    class conGa extends Animal{
    public conGa(){
        this.soChan = 2;
    }

        @Override
        void dichuyen(int x, int y) {
            System.out.println("Con Ga di chuyen");

        }

        @Override
        public void an() {
            System.out.println("Con Ga an thoc");

        }

        @Override
        public void uong() {
            System.out.println("Con Ga uong nuoc mua");
        }

    }
    class X implements anUong{

        @Override
        public void an() {

        }

        @Override
        public void uong() {

        }
    }

    class Main{
        public static void main(String[] args) {
            Animal a1;
            a1 = new conLon();
            a1.dichuyen(1,1);

            a1 = new conGa();
            a1.dichuyen(1,1);

            a1.an();
            a1.uong();

            choAn(new conLon());
            choAn(new conGa());
            choAn(new X());
        }
        static void choAn(anUong t){      //static void choAn(Animal t){
            t.an();
            System.out.println("tao ham truyen vao khong phai tham so");
        }
    }
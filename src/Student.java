public class Student {
    int MSSV;
    String hoVaTen;
    private String matKhau;

    //constructor

    Student(){
        System.out.println("Create a student");
        this.MSSV=10;
    }
    Student(int MSSV){
        System.out.println("Ham khoi tao voi tham so interger");
    }
    Student(String hoVaTen){
        System.out.println("Ham khoi tao voi tham so String");
    }
    int getMSSV(){
        return this.MSSV+2016000;
    }

    //over load

    void setMSSV(int x){
        System.out.println("Ham khoi tao voi input int");
        this.MSSV = x;
    }
    void setMSSV(String x){
        System.out.println("Ham khoi tao voi input String");
        this.MSSV = Integer.parseInt(x);
    }

    void setMatKhau(String newmatKhau){
        this.matKhau = newmatKhau;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(123);
        Student s3 = new Student("20");

        s1.MSSV = 10;
        s2.MSSV = 20;

        s1.setMSSV(-123);
        s2.setMSSV(20);
        s2.setMSSV("20");

        s1.setMatKhau("123");
        System.out.println(s1.getMSSV());
        System.out.println(s2.getMSSV());
    }
}


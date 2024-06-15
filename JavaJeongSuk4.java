public class JavaJeongSuk4 {

    public static void main(String[] args) {
//        A a = new A();
//        a.a =777;
//
//        C c = new C();
//        c.bMethod();
        B b = new B();
    }

}

class A {
    int a;
    A(){
        System.out.println("this is A Contructor");
    }
}

class B extends A {
    int b;
    B(){}

}

class C extends B{
//    int c;

    void bMethod(){
        super.a = 99;
        System.out.println("super.a = " + super.a);
    }

//    C getObjB(){
//        B b = super();
//    }
}

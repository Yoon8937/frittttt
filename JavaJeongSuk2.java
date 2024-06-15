import java.nio.file.WatchKey;
import java.util.Scanner;

public class JavaJeongSuk2 {

    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//
//            for(int j=0;j<10;j++){
//                if(j%2!=0){
//                    System.out.println("continueee");
//                    continue;
//                }
//            }
//            System.out.println("i "+ i );
//        }


//        Point3d p3 = new Point3d();
//        p3.x = 3;
//        p3.y = 4;
//        p3.z = 5;
//        String  tmp = p3.getLocation();
//        System.out.println("tmp = " + tmp);

        Child c = new Child();
//        Parent p = new Parent();
        Parent p = new Child();
        if(p instanceof Child){
            Child cc = (Child) p; //야 시발 이게 어떻게 되지
            cc.tmp();
        }
    }

}
//추상클래스의 메서드를 오버라이딩하여 사용해보기
class Parent {
    int x;

    void method(){
        System.out.println("this is Parent's method");
    }

}


class Child extends Parent {
    int y;

    void tmp(){
        System.out.println("tmp");
    }
    void callParentMethod(){
        super.method();
        this.tmp();
    }
}

abstract class Fuck {
    abstract void method();
    void me(){
        System.out.println();
    }
}


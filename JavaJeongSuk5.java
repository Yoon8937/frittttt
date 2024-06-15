import java.awt.*;
import java.awt.image.ImageProducer;

public class JavaJeongSuk5 {

    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = a.b1();
        System.out.println(b);
        String s1 = new String("java");;
        String s2 = s1;
        String s3 = new String("java");;
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1 == s3);


    }

}




class Aa {
    int a = 7;

    Aa a1(){
        return new Bb();
    }

    Bb b1(){
        return new Bb();
    }
}

class Bb extends Aa {
    int b = 8;
    Aa Amthod(){
        return new Aa();
    }

    Aa me(){
        return new Bb();
    }


//    Bb Bmethod(){ //impossible
//        return new Aa();
//    }



}
public class JavaJeongSuk {

    public static void main(String[] args) {
//        long l = 100_0000_0000;//에러 발생
//        System.out.println(l);

        String name = "Java";
        String str = name + 8.0;
        System.out.println(str);
        int i = 5;
        System.out.println(++i * ++i);

        char c = (char)65;
        System.out.println(c);
        int ii = 'A';
        System.out.println(ii);

        int b = 300;
        byte bb = (byte)b;
        System.out.println(bb);

        int k =3;
        int kk= k;
        System.out.println(kk);

        byte baa = 10;
        byte bbb = 20;
//        byte bans = baa + bbb; //에러
//        byte bans = (byte) baa + bbb;//에러
        byte bans = (byte)(baa + bbb);
        System.out.println(bans);

        double pi = 3.141592;
        System.out.println(Math.round(pi*1000) / 1000.0);
        System.out.println(8.5%3);


        for(int iii=0,jjj=10;iii<10;iii+=1, jjj += 10){
            System.out.println(iii+ " " + jjj);
        }



    }

}

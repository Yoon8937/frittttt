public class JavaJeongSuk3 {

    int a;
    JavaJeongSuk3 test(){
        return this;
    }

    public static void main(String[] args) {
//        JavaJeongSuk3 j = new JavaJeongSuk3();
//        j.a = 777;
//        System.out.println("j = " + j);
//        JavaJeongSuk3 jj = j.test();
//        System.out.println("jj = " + jj);


        User u = new User();
        u.id = 7;
        u.name = "cherry";
        System.out.println("u = " + u);
        User u2 = u.curUesrObj();
        System.out.println(u2);
        u2.name = "ornage";
        System.out.println("u = " + u);
        User.sex = "male";
        System.out.println("u2 = " + u2);


    }

}

class User {
    int id;
    String name;

    static String sex;

    User(){}
    User(int id, String name){
        this.id = id;
        this.name = name;
    }

    User curUesrObj(){
        return this;
    }

//    static User method(){ //이렇게는 사용불가
//        return this;
//    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", User.sex = " + sex + " }";
    }
}


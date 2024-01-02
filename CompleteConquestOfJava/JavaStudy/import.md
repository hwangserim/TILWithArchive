package pack;

import pack.a.\*; //다른 패키지에 있는 클래스를 모두 가져와서 사용할 수 있다

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지명 생략 가능
        User2 user2 = new User2();
    }

}

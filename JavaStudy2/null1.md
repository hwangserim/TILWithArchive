package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigdata = new BigData();
        bigdata.data =  new Data(); //참조할 값을 줌
        System.out.println("BigData.count=" + bigdata.count);
        System.out.println("BigData.data=" + bigdata.data);

        //NullPointerException
        System.out.println("BigData.data.value=" + bigdata.data.value);

    }

}

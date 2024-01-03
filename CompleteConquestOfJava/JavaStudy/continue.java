package practice2;

public class Continue1 {

    public static void main(String[] args) {
    int i = 1;

    while(i <=5) {
    	if (i==3) {
    		i++;
    		continue; //3이 출력 안됨
    	}
    	System.out.println(i);
    	i++;
    }

    }

}

package practice2;

public class For2 {

    public static void main(String[] args) {

    	int sum = 0;
    	int endnum = 3;

    	//1+2+3 =6
    	for(int i =1; i<= endnum; i++) { //초기식; 조건식; 증감식
    		sum = sum + i;
    		System.out.println("i는:" + i + "sum은:" + sum);
    	}

    }

}

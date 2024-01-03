package practice2;

public class MethodReturn1 {

    public static void main(String[] args) {
    	boolean result = odd(1);
    	System.out.println(result);

    }

    public static boolean odd(int i) {
    	if(i % 2 ==1) {
    		return true;
    		}else {
    		return false; //메서드는 항상 리턴
    	}
    }

}

package practice2;

public class Array1Ref2 {

    public static void main(String[] args) {
    	int [] students; //배열 변수 선언
    	students = new int[5];
    	//연결된 다섯개 그릇이 있는 int형 변수 만듦


    	//변수 값 대입
    	students[0] = 90;
    	students[1] = 80;
    	students[2] = 70;
    	students[3] = 60;
    	students[4] = 50;


    	for(int i =0; i<students.length; i++) {
    		System.out.println("학생" + (i+1) + "점수." + students[i]);
    	}



    }

}

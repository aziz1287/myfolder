package CheckEmolpyeePresent;

public class CheckEmpPresentOrAbsentUC1 {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2 ;
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME) 
			System.out.println("Employee is Present");	
//		else)


	}

}

package CheckEmolpyeePresent;

public class SolUseSwitchCaseUC4 {
	
	static final int IS_PRESENT = 3;
	
	static final int IS_PART_TIME = 2;
	
	static final int SALARY_PER_HOUR = 30;
	

	public static void main(String[] args) {
		
		int empCheck;
		
		empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		int empHr = 0;
		
		switch (empCheck) {
		case IS_PRESENT:
			
			empHr = 9;
			break;
			
		case IS_PART_TIME:
			
			empHr = 4;
			break;
			
			default:
				
				empHr = 0;
				break;
		}
		
		double empSalary = empHr * SALARY_PER_HOUR;
		
		System.out.println("Emp wage : " +empSalary);
		
		

	}

}

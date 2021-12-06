package CheckEmolpyeePresent;

public class AddParttimeEmpWageUC3 {

	public static void main(String[] args) {
		
		int IS_PRESENT = 2;
		
		int IS_PART_TIME = 2;
		
		int SALARY_PER_HOUR = 60;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		int empHr = 0;
		
		if (empCheck == IS_PRESENT) {
			
			empHr = 9;
			
			
		} else if (empCheck == IS_PRESENT) {
			
			empHr = 4;
			
		} else {
			
			empHr = 0;
		}
		
		double empSalary = empHr * SALARY_PER_HOUR;
		
		System.out.println("Emp Wage : " + empSalary);

	}

}

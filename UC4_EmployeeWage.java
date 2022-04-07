package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC4_EmployeeWage {

	final static int wagePerHr=20;
	final static int fullTimeHrs=8;
	final static int partTimeHrs=8; 
	static int empCheck;
	static int empHrs;	
	public static void main(String[] args) {

		empHrs = 0;
		empCheck = (int) Math.floor(Math.random() * 10) % 3;
		//check the overall conditions
		if (empCheck ==1 )
			System.out.println("Employee is Present");
		else if (empCheck==2)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		//use switch case statement
		switch(empCheck) {

		case 1:
			empHrs=8;
			System.out.println("Employee is Full Time");
			break;

		case 2:
			empHrs=4;
			System.out.println("Employee is Part Time");
			break; 

		case 3:
			empHrs=0;
			break; 

		}
		int empWages=empHrs*wagePerHr;
		//print the message
		System.out.println("Employee Wage is: " + empWages);
	}

}
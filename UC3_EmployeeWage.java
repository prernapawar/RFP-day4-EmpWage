package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC3_EmployeeWage {

	final static int wagePerHr=20;
	final static int fullTimeHrs=8;
	final static int partTimeHrs=8;
	static int empCheck;
	public static void main(String[] args) {

		empCheck = (int) Math.floor(Math.random() * 10) % 3;
		//check the conditions
		if (empCheck ==1 )
			System.out.println("Employee is Present");
		else if (empCheck==2)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
   }
}
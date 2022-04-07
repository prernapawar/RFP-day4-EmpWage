package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC2_EmployeeWage {

	final static int wagePerHr=20;
	final static int fullTimeHrs=8;
	static int empCheck;
      //calling main function
	public static void main(String[] args) {
    empCheck = (int) Math.floor(Math.random() * 10) % 3;
		//check the conditions and print the message
		if (empCheck ==1 )
			System.out.println("Employee is Present");
		else if (empCheck==2)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");


	}
}
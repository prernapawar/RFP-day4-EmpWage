package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC1_EmployeeWage {
	public static void main(String[] args) {

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		//check if else conditions
		if (empCheck ==1 )
			System.out.println("Employee is Present");
		else if (empCheck==2)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
   }

}
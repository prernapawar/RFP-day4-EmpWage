package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC6_EmployeeWage{
	final static int wagePerHr=20;
	final static int fullTimeHrs=8;
	final static int partTimeHrs=8; 
	final static int maxHrs=100;
	final static int daysPerMonth=20;
	static int empHrs;
	static int empCheck;
	static int empWages;
	
    public static void main(String[] args) {
        int totalEmpHrs=0;
		int Maxdays=0;
		int totalMaxEmpWage=0;
    //check the while loop
		while (totalEmpHrs <= maxHrs && Maxdays <= daysPerMonth) {

			empHrs=0;
			Maxdays++;

			empCheck = (int) Math.floor(Math.random() * 10) % 3;
			if (empCheck ==1 )
				System.out.println("Employee is Present");
			else if (empCheck==2)
				System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");
      //use switch case
			switch(empCheck) {

			case 1:
				empHrs=8;
				System.out.println("Employee is Full Time");
				break;

			case 2:
				empHrs=8;
				System.out.println("Employee is Part Time");
				break; 

			case 3:
				empHrs=0;
				break;

			}
			totalEmpHrs=totalEmpHrs + empHrs;
			empWages=empHrs*wagePerHr;
			totalMaxEmpWage=totalMaxEmpWage + empWages;
			System.out.println("Employee Wage is: " + empWages);

		}
		System.out.println("Total Employee Wage: " + totalMaxEmpWage);
	}

}
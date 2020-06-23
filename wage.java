public class wage

{

	public static void main(String args[]) 
	{

		System.out.println("Welcome to wage Computation");

		int is_part = 1;
		int is_full = 2;
		int emp_rate_per_hour = 20;


		int emp_hrs = 0;
		int emp_wage = 0;

		double attandance = Math.floor(Math.random()*10)%3;
		System.out.println("Attandance is: "+attandance);

		
		if( attandance == is_full )
			emp_hrs = 8;
		else if( attandance == is_part )
			emp_hrs = 4;
		else
			emp_hrs = 0;

		emp_wage = emp_hrs * emp_rate_per_hour;
		System.out.println("Daily Wage: Rs."+emp_wage);
	}

}

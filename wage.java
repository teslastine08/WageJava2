public class wage

{
	public static final int is_part = 1;
	public static final int is_full = 2;
	public static final int emp_rate_per_hour = 20;
	public static final int no_of_working_days = 20;

	public static void main(String args[]) 
	{

		System.out.println("Welcome to wage Computation");


		int emp_hrs = 0;
		int emp_wage = 0;
		int total_emp_wage = 0;

		for(int day = 0; day < no_of_working_days; day++)

		{
		int attandance =  (int) Math.floor(Math.random()*10)%3;
		System.out.println("Attandance is: "+attandance);

		
		switch (attandance)
		{
			case is_part:
				emp_hrs = 4;
				break;
			case is_full:
				emp_hrs = 8;
				break;
			default:
				emp_hrs = 0;
		}

		emp_wage = emp_hrs * emp_rate_per_hour;
		System.out.println("Daily Wage: Rs."+emp_wage);

		total_emp_wage += emp_wage;

		}
		System.out.println("Total employee wage: Rs."+total_emp_wage);
	}

}

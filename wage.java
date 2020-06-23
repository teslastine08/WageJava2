public class wage

{
	public static final int is_part = 1;
	public static final int is_full = 2;
	public static final int emp_rate_per_hour = 20;
	public static final int no_of_working_days = 20;
	public static final int max_hours_mnths = 100;

	public static void main(String args[]) 
	{

		System.out.println("Welcome to wage Computation");


		int emp_hrs = 0;
		int total_emp_hrs = 0;
		int total_work_days = 0;
		
		while ( total_emp_hrs <= max_hours_mnths && total_work_days < no_of_working_days)
		{
		total_work_days++;

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

		total_emp_hrs += emp_hrs;
		System.out.println("Day: "+total_work_days + " emp hrs: "+emp_hrs);

		}
		int total_emp_wage = total_emp_hrs * emp_rate_per_hour;
		System.out.println("Total employee wage: Rs."+total_emp_wage);
	}

}

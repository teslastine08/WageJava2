public class wage

{
        int workinghrs = 8;
        int dailywage = 20;
        static int salary;
        static{
                salary=10000;
                System.out.println("Total Salary: "+salary);
                }
        public int calculatesalary(int workinghrs, int dailywage)
                {
                int salary = workinghrs*dailywage;
                return salary;
                }

	public static String getcompanyname()
		{
		return "HNG Tech";
		}

        public static void main(String args[])
        {

                System.out.println("Welcome to wage Computation");


                wage empwage = new wage();
		
		System.out.println("Company Name: "+getcompanyname());
                System.out.println("Employee salary: Rs."+empwage.calculatesalary(empwage.workinghrs, empwage.dailywage));

        }

}

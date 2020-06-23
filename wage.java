import java.util.Scanner;
public class wage

{
        int workinghrs = 8;
        int dailywage = 20;

        public int calculatesalary(int workinghrs, int dailywage)
                {
                int salary = workinghrs*dailywage;
                return salary;
                }

        public static void main(String args[])
        {

                System.out.println("Welcome to wage Computation");


                wage empwage = new wage();

                System.out.println("Employee salary: Rs."+empwage.calculatesalary(empwage.workinghrs, empwage.dailywage) );
        }

}



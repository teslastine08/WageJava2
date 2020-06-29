public interface IComputeEmpWage
{
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfworkDays, int maxhourmnths);
	public void computeEmpWage();
	public void getTotalWage(String company);
}

public class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHour;
	public final int noOfworkDays;
	public final int maxhourmnths;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRateperHour, int noOfworkDays, int maxhourmnths);
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfworkDays = noOfworkDays;
		this.maxhourmnths = maxhourmnths;
		totalEmpWage = 0;
	}

	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString()
	{
		return "total Emp Wage for "+company+ "is Rs."+totalEmpWage;
	}
}

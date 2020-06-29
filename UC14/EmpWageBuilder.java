public class EmpWageBuilder implements IComputeEmpWage
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int noOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage>companyToEmpWageMap;

	public EmpWageBuilder()
	{
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfworkDays, int maxhourmnths)
	{
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, noOfworkDays, maxhourmnths);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(Company, companyEmpWage);
	}

	public void computeEmpWage()
	{
		for (int i = 0; i < companyEmpWageList.size(); i++)
		{
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company)
	{
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int computeEmpWage companyEmpWage() {...}

	public static void main(String[] args)
	{
		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage[ company "HNG", empRatePerHour "20", noOfworkDays "28", maxhourmnths "100"];
		empWageBuilder.addCompanyEmpWage[ company "ITC", empRatePerHour "30", noOfworkDays "20", maxhourmnths "150"];
		empWageBuilder.computeEmpWage();

		System.out.println("Total wage of HNG: "+empWageBuilder.getTotalWage( company "HNG" ));
	}
}

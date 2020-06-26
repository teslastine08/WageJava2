class wage{
        public static final int Is_Parttime=1;
        public static final int Is_Fulltime=2;

        private final String company;
        private final int wagePerHr;
        private final int number_of_working_days;
        private final int max_hrs_in_month;
        private int totalEmpWage;

                public wage(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month)
		{
                        this.company=company;
                        this.wagePerHr=wagePerHr;
                        this.number_of_working_days=number_of_working_days;
                        this.max_hrs_in_month=max_hrs_in_month;
                }
                public void wage_compute(){
                int hrs=0, total_hrs=0, totalWorkingDays=0;
                while (total_hrs <= max_hrs_in_month && totalWorkingDays < number_of_working_days){
                totalWorkingDays++;
                double random_Check_2=Math.floor(Math.random() * 10) % 3;
                int random=(int)random_Check_2;
                switch(random){
                                case Is_Parttime:
                                hrs=4;
                                break;
                                case Is_Fulltime:
                                hrs=8;
                                break;
                                default:
                                hrs=0;
                        }
                        total_hrs+=hrs;
                        System.out.println("Day: " + totalWorkingDays + " Emp Hr: " +hrs);
                }
                totalEmpWage=total_hrs*wagePerHr;
                }
                public String toString(){
                        return "Total emp wage for company: " +company+ "is :" +totalEmpWage;
}

public static void main(String[] args) {
        System.out.println("Welcome to Employee wage caluclation using Java");
        wage HNG=new wage("HNG", 20, 28, 100);
        wage ITC=new wage("ITC", 30, 30, 150);
        HNG.wage_compute();
        System.out.println(HNG);
        ITC.wage_compute();
        System.out.println(ITC);

}
}

public class Employeewage 
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        private int totalEmpWage;

        public Employeewage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company = company;
                this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
        }

        public void computeEmpwage() {
                int empHrs = 0; 
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays )
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck)
			{
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " empHrs: " +empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

        @Override
        public String toString() {
            return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
        }

        public static void main(String[] args) {
            Employeewage dMart = new Employeewage("DMART", 20, 2, 10);
            Employeewage reliance = new Employeewage("Reliance", 10, 4, 20);
            dMart.computeEmpwage();
            System.out.println(dMart);
            reliance.computeEmpwage();
            System.out.println(reliance);
        }
}

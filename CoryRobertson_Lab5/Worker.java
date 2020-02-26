
public class Worker 
{
	int hours;
	double rate;
	double salary;
	double sales;
	int payState;
	String name;
	boolean bonus;
	public Worker(int hours, double rate, String name, boolean bonus) 
	{
		payState = 0;
		this.hours = hours;
		this.rate = rate;
		this.name = name;
		this.bonus = bonus;
	}
	public Worker(double salary, String name, boolean bonus, boolean s) 
	{
		payState = 1;
		this.salary = salary;
		this.name = name;
		this.bonus = bonus;
	}
	public Worker(double sales, String name, boolean bonus) 
	{
		payState = 2;
		this.sales = sales;
		this.name = name;
		this.bonus = bonus;
	}
	
	public String printWorker() 
	{
		String retn = "";
		switch(payState)
		{
		case 0:
			retn += getName() + "\t" + getPayClass() + "\t" + hours + "\t\t" + rate + "\t" + weeklyPay();
		break;
		case 1:
			retn += getName() + "\t" + getPayClass() + "\t\t\t" + weeklyPay();
		break;
		case 2:
			retn +=  getName() + "\t" + getPayClass() + "\t" + sales + "\t\t" + weeklyPay();
		break;
		}
		//if(bonus) 
		//{
		//	retn += "*";
		//}
		return retn;
	}
	
	/**
	 * Returns the weekly pay for the worker with $ prefix
	 * 
	 */
	public String weeklyPay() 
	{
		double weeklyPay = 0;
		switch(payState)
		{
		
		case 0:
			weeklyPay += (hours * rate);
			if(hours > 40) weeklyPay += ((hours - 40) * (rate));
			break;
		case 1:
			weeklyPay += salary;
			
			break;
		case 2:
			weeklyPay += (sales * 0.2);
			
			break;
		}
		
		if(bonus)
		return "$" + (weeklyPay * 1.1) + "*";
		else
		return "$" + weeklyPay;	
	}
	
	public double weeklyPayDollars() 
	{
		double weeklyPay = 0;
		switch(payState)
		{
		
		case 0:
			weeklyPay += (hours * rate);
			if(hours > 40) weeklyPay += ((hours - 40) * (rate));
			break;
		case 1:
			weeklyPay += salary;
			
			break;
		case 2:
			weeklyPay += (sales * 0.2);
			
			break;
		}
		if(bonus)
		weeklyPay *= 1.1;
		return weeklyPay;
	}
	
	public String getName() 
	{
		
		return name;
	}
	
	/**Returns the type of pay the worker gets
	 * e.g. hourly, salary, commission
	 * 
	 */
	public String getPayClass() 
	{
		switch(payState)
		{
		case 0:
			return "Hourly";
		case 1:
			return "Salaried";
		case 2:
			return "Commissioned";
		}
		return "";
		
	}
	
}

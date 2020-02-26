import java.util.ArrayList;
import java.util.Scanner;
public class SalaryTable 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Worker> arr = new ArrayList<Worker>() ;

		//arr.add(new Worker(3300.0, "James Hogan", true));
		//arr.add(new Worker(45, 10.95, "Jennifer Waltz", false));
		//arr.add(new Worker(32, 15.00, "Moly Smith", false));
		//arr.add(new Worker(2600.0, "Joan Han", false));
		//arr.add(new Worker(10, "Marry Butler", false));
		int input = 0;
	
		while(input != 2) 
		{
			System.out.println("Choose an option: ");
			System.out.println("1. Add a worker");
			System.out.println("2. Quit");
			input = in.nextInt();
			if(input == 1) 
			{
				in.nextLine();
				System.out.println("Enter a name: ");
				String name = in.nextLine();
				System.out.println("Enter a pay type(1 if hourly, 2 if salary, 3 if commissioned): ");
				int payType = in.nextInt();
				// 1 = hour, 2 = salary, 3 = commiss
				boolean bonus;
				String choice;
				switch(payType) 
				{
				case 1:
					System.out.println("Enter the amount of hours worked: ");
					int hours = in.nextInt();
					System.out.println("Enter the pay rate: ");
					double rate = in.nextDouble();
					in.nextLine();
					System.out.println("Give Employee a bonus? (Y/N): ");
					choice = in.nextLine();

					if(choice.equalsIgnoreCase("Y")) {bonus = true;} else {bonus = false;}
					arr.add(new Worker(hours, rate, name, bonus));
					System.out.println("Worker Added...");
					break;
				case 2:
					System.out.println("Enter the weekly salary: ");
					double salary = in.nextDouble();
					in.nextLine();
					System.out.println("Give Employee a bonus? (Y/N): ");
					choice = in.nextLine();
					if(choice.equalsIgnoreCase("Y")) {bonus = true;} else {bonus = false;}	
					arr.add(new Worker(salary, name, bonus, false));
					System.out.println("Worker Added...");
					break;
				case 3:
					System.out.println("Enter the amount of sales: ");
					double sales = in.nextDouble();
					in.nextLine();
					System.out.println("Give Employee a bonus? (Y/N): ");
					choice = in.nextLine();
					if(choice.equalsIgnoreCase("Y")) {bonus = true;} else {bonus = false;}	
					arr.add(new Worker(sales, name, bonus));
					System.out.println("Worker Added...");
					break;
				}

	
				
			}
			

			
		}
		printSalaryTable(arr);
		
	}
	

	public static void printSalaryTable(ArrayList<Worker> arr) 
	{
		
		System.out.println("Name\tClass\tHours\tSales\tRate\tWeekly Pay");
		System.out.println("====================================================");
		for(int i = 0; i < arr.size(); i++) 
		{
			System.out.println(arr.get(i).printWorker());
		}
		System.out.println("====================================================");
		double total = 0;
		for(int i = 0; i < arr.size(); i++) 
		{
			total += arr.get(i).weeklyPayDollars();
		}
		System.out.println("TOTAL $" + total);
		System.out.println("*A 10% bonus is awarded");
		
	}
}

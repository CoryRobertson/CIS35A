import java.util.Scanner;
public class VendingMachine 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int dollars = 0, quarters = 0, dimes = 0, nickels = 0, pennys = 0;
		System.out.println("Enter how many dollars do you have: ");
		dollars = input.nextInt();
		System.out.println("Enter how many quarters do you have: ");
		quarters = input.nextInt();
		System.out.println("Enter how many dimes do you have: ");
		dimes = input.nextInt();
		System.out.println("Enter how many nickels do you have: ");
		nickels = input.nextInt();
		System.out.println("Enter how many pennys do you have: ");
		pennys = input.nextInt();
		
		double money = 0.00;
		
		money += dollars;
		money += (quarters*0.25);
		money += (dimes*0.10);
		money += (nickels*0.05);
		money += (pennys*0.01);
		
		//System.out.println("Money: " + money);
		
		int potatoChipsStock = 2;
		int cookieStock = 0;
		int candyStock = 3;
		
		System.out.println("Choices: \n 1)\tPotato Chips $1.25\n 2)\tCookies $0.85\n 3)\tCandies $0.95");
		/*
		 * 1 potato chips $1.25
		 * 2 Cookies $0.85
		 * 3 Candies $0.95
		 */
		System.out.println("Money: " + money);
		int choice = input.nextInt();
		input.close();
		switch(choice) 
		{
		case 1: // potato chips case
			if(potatoChipsStock > 0) 
			{
				if(money >= 1.25) 
				{
					money -= 1.25;
					System.out.println("Please take your potato chips.");
				} else {System.out.println("You lack required funds to purchase potato chips.");}
			} else {System.out.println("Potato chips are out of stock");}
		break;
		case 2: // cookie case
			if(cookieStock > 0) 
			{
				if(money >= 0.85) 
				{
					money -= 0.85;
					System.out.println("Please take your cookie.");
				} else {System.out.println("You lack required funds to purchase a cookie.");}
			} else {System.out.println("Cookies are out of stock");}
		break;
		case 3: // candy case
			if(candyStock > 0) 
			{
				if(money >= 0.95) 
				{
					money -= 0.95;
					System.out.println("Please take your candy.");
				} else {System.out.println("You lack required funds to purchase candy.");}
			} else {System.out.println("Candy is out of stock");}
		break;
		
		} // end switch statement
		
		//  dollars = 2.46
		System.out.println("Change: \t$" + money);
		dollars = (int)money / 1; // dollars = 2 now
		money -= dollars; // money -= 2, money = 0.46
		quarters = (int) ((money*100) / 25); // quarters .46 * 100 = 46, 46 / 25(int) = 1
		money -= quarters*0.25;
		dimes = (int) ((money*100) / 10);
		money -= dimes*0.10;
		nickels = (int) ((money*100) / 5);
		money -= nickels*0.05;
		pennys = (int)((money*100));
		money -= pennys*0.01;
		
		System.out.println("Dollars: \t" + dollars);
		System.out.println("Quarters: \t" + quarters);
		System.out.println("Dimes: \t\t" + dimes);
		System.out.println("Nickels: \t" + nickels);
		System.out.println("Pennys: \t" + pennys);
		
	}

}

public class Money 
{
	public int dollars, cents; 
	
	public Money() 
	{
		this.dollars = 0;
		this.cents = 0;
	}

	public Money(int dollars, int cents) 
	{
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public Money add(Money m) 
	{
		return new Money(m.dollars + this.dollars, m.cents + this.cents);
	}
	
	public Money substract(Money m) 
	{
		return new Money(this.dollars - m.dollars, this.cents - m.cents);
	}
	
	public Money multiply(int m) 
	{
		// dollars = 1, cents = 37, m = 2
		double total = (this.dollars * 100) + this.cents;
		// total = 137
		total *= m;
		// total = 274
		int dollars = (int) (total / 100);
		int cents = (int) total - (dollars * 100);
		//System.out.println();
		return new Money(dollars, cents);
	}
	
	public static Money[] multiply(Money[] moneys, int amt) 
	{
		Money[] moneysReturn = new Money[moneys.length];
		for(int i = 0; i < moneysReturn.length; i++) 
		{
			moneysReturn[i] = moneys[i].multiply(amt);
		}
		
		return moneysReturn;
	}
	
	public boolean equals(Money money) 
	{
		if(money.dollars == this.dollars && money.cents == this.cents) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public String toString() 
	{
		return "$" + this.dollars + "." + this.cents;	
	}
	
	private void normalize() // normalize dollars and cents field 
	{ // cents == 113
		this.dollars += this.cents / 100;
		this.cents = this.cents % 100; // 
	}
}
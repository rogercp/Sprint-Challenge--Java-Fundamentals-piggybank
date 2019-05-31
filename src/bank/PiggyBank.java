package bank;

import java.util.ArrayList;

public class PiggyBank
{
	private ArrayList <Money> savings= new ArrayList<Money>();
	private double totalSavings;

	public void add(Money money)
	{
		this.totalSavings=money.getTotal();
		this.savings.add(money);

	}

	public void printContents()
	{
		for(Money money :savings)
		{
			int quantity=money.getQuantity();
			String name= money.getName();

			 if (name == "Dollar") 
			 {
                System.out.println("$" + quantity);
             } else 
            	{
                System.out.println(quantity + " " + name);
                }
          }
            
	}



		

    public void printValue() 
    {
        System.out.println("The piggy bank holds " + this.totalSavings);
    }
}
	
package bank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class PiggyBank
{
	private ArrayList <Money> savings= new ArrayList<Money>();
	private double totalSavings;

	public void add(Money money)
	{
		this.totalSavings+=money.getTotal();
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


 	DecimalFormat fp = new DecimalFormat("$###,###.00");

    public void printValue() 
    {
        System.out.println("The piggy bank holds " + fp.format(this.totalSavings));
    }
}
	
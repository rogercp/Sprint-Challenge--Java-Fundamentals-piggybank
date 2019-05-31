package bank;


public class Dime extends Money
{
	private String name="Dime";
	private int quantity;
	private double value=.10;
	private double total;

	public  Dime(int quantity)
	{
		this.quantity=quantity;
		this.total=quantity*this.value;
		if(quantity>1)
		{
			this.name="Dimes";
		}
	}

	public  Dime()
	{
		this.quantity=1;
		this.total=this.value;
	}

	@Override
	public String getName()
	{
		return name;
	}


	@Override
	public  double getTotal()
	{
		return total;
	}

	@Override
	public int getQuantity()
	{
		return quantity;
	}


}
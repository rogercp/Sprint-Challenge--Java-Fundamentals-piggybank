package bank;


public class Nickel extends Money
{
	private String name="Nickel";
	private int quantity;
	private double value=.05;
	private double total;

	public  Nickel(int quantity)
	{
		this.quantity=quantity;
		this.total=quantity*this.value;
	}

	public  Nickel()
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
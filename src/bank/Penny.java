package bank;


public class Penny extends Penny
{
	private String name="Penny";
	private int quantity;
	private double value=.01;
	private double total;

	public  Penny(int quantity)
	{
		this.quantity=quantity;
		this.total=quantity*this.value;
	}

	public  Penny()
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
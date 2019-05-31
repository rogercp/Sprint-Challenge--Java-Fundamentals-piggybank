package bank;


public class Quarter extends Money
{
	private String name="Quarter";
	private int quantity;
	private double value=.25;
	private double total;

	public  Quarter(int quantity)
	{
		this.quantity=quantity;
		this.total=quantity*this.value;
		if(quantity>1)
		{
			this.name="Quarters";
		}
	}

	public  Quarter()
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
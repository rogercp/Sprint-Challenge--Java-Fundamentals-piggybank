package bank;


public class Dollar extends Money 
{
	private String name="Dollar";
	private int quantity;
	private double value=1.00;
	private double total;

	public  Dollar(int quantity)
	{
		this.quantity=quantity;
		this.total=(double)quantity*this.value;
		
	}
	public Dollar ()
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
package project1;

public class Product 
{
	private int pId;
	private String pName;
	private double price;
	private String brand;
	private int qty;

	public Product()
	{

	}

	public Product(int pId, String pName, double price, String brand, int qty) 
	{
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		this.qty = qty;
	}

	public int getpId() 
	{
		return pId;
	}

	public void setpId(int pId) 
	{
		this.pId = pId;
	}

	public String getpName() 
	{
		return pName;
	}

	public void setpName(String pName) 
	{
		this.pName = pName;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public int getQty() 
	{
		return qty;
	}

	public void setQty(int qty) 
	{
		this.qty = qty;
	}



}

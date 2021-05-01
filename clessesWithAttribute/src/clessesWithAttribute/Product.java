package clessesWithAttribute;

public class Product {
	
	


private String name;
  private	String descr;
  private double price;
  private int stockAmount;
  
  
  
  public Product(int id, String name,String descr , int stockAmount, double price) {
	  
	  System.out.println("Ben çalýþtým");
  };
  
  
  
  
  
  public Product() {
	  
  };





	private	int id;
  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescr() {
		return descr;
	}


	public void setDescr(String descr) {
		this.descr = descr;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStockAmount() {
		return stockAmount;
	}


	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
		
	}
	
	

}

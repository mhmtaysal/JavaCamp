package clessesWithAttribute;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Tablet","black",100,1200.2);
		
		
		Product product2 = new Product();
		product2.setId(2);	
		product2.setPrice(17.2); 
		
		product2.getId();

		System.out.println(product.getName());

		ProductManager productmanager = new ProductManager();

		productmanager.Add(product);

		productmanager.Add2(0, null, "TV", 0, 0);
		
		productmanager.Add3(product);
	
		
		
System.out.println(product.getId());


	}

}

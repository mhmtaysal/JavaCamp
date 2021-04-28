package clessesWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.name="Laptop";
		product.price = 17.2;
		
		product.getId();

		System.out.println(product.name);

		ProductManager productmanager = new ProductManager();

		productmanager.Add(product);

		productmanager.Add2(0, null, null, 0, 0);
	
		
		
System.out.println(product.getId());


	}

}

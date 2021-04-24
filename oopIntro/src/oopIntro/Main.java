package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		
		Product product1 = new Product(1,"Lenovo v14",1500,"16 GB RAM"); // s�n�f� olu�turmak i�in �u hareketi yapaca��z, �rnek olu�turma, instance, referans
	
		
		
		
		
		Product product2 = new Product(); 
		product2.id = 2;
		product2.name ="toshiba ";
		product2.unitPrice =1600;
		product2.detail = "16 GB RAM";
		
		
	
		Product product3 = new Product();
		product3.id = 3;
		product3.name ="HP";
		product3.unitPrice =1200;
		product3.detail = "8 GB RAM";
		
		Product[] products = {product1, product2,product3};
		

		
		for (Product product : products) {
			
			System.out.println(product.name);
		}
	
		
		System.out.println(products.length);
		
		
		Category category1 = new Category ();
		
		category1.id =1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id =1;
		category2.name = "Ev/Bah�e";
		
		ProductManager productManager = new ProductManager(); // bir s�n�f� kullanacaksan newlemen gerekir.
		
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		
	 
	}

}

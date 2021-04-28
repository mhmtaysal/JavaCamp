package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Product product1 = new Product(1,"Lenovo v14",1500,"16 GB RAM"); // sýnýfý oluþturmak için þu hareketi yapacaðýz, örnek oluþturma, instance, referans
		
		
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo");
		product2.setDetail("white");
		product2.setDiscount(10);
		product2.setUnitPrice(1600);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
	Category category1 = new Category();
	 category1.setId(1);
	 category1.setName("Yiyecek");
	 
	 System.out.println(category1.getName());
	 System.out.println(category1.getId());
	 
	}

}

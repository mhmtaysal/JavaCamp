package kodlamaio.northwind.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productSercive;
	
	@Autowired
	public ProductsController(ProductService productSercive) {
		super();
		this.productSercive = productSercive;
	}


	@GetMapping("/getall")
	public List<Product> getAll() {
		return this.productSercive.getAll();
	}

}

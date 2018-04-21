package jsf;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Scope(value = "request")
@Controller(value = "productList")
public class ProductListController {

	@Autowired
	private ProductRepository productRepository;
	@Getter
	private List<Product> products = new ArrayList<>();

	public List<Product> getMyProducts() {
		return productRepository.findAll();
	}


}

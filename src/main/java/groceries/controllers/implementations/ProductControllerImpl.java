package groceries.controllers.implementations;

import groceries.controllers.interfaces.ProductController;
import groceries.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductControllerImpl implements ProductController {


    private ProductService productService;

    @Autowired
    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    @GetMapping("/products")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "store";
    }

    @Override
    @GetMapping("/productsbs")
    public String showShopPage(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "index";
    }
}

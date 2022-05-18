package grocery.controllers.implementations;
import grocery.controllers.interfaces.ProductController;
import grocery.service.interfaces.ProductService;
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

    @Override
    public String findPaginated(Model model) {
        return null;
    }

    @Override
    public String deleteProduct(Model model) {
        return null;
    }

    @Override
    public String showFormForUpdate(Model model) {
        return null;
    }

    @Override
    public String saveProduct(Model model) {
        return null;
    }

    @Override
    public String showNewProductForm(Model model) {
        return null;
    }

    @Override
    public String viewHomePage(Model model) {
        return null;
    }
}
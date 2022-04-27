package groceries.controllers.interfaces;

import org.springframework.ui.Model;

public interface ProductController {
    String showAllProducts(Model model);

    String showShopPage(Model model);
}

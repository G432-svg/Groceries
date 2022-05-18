package grocery.controllers.interfaces;

import org.springframework.ui.Model;

/**
 *
 */
public interface ProductController {
    String showAllProducts(Model model);
    String showShopPage(Model model);
    String findPaginated(Model model);
    String deleteProduct(Model model);
    String showFormForUpdate(Model model);
    String saveProduct(Model model);
    String showNewProductForm(Model model);
    String viewHomePage(Model model);

}

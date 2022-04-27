

package groceries.data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Products {
    private List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }

//    public List<Product> getProducts(Id) {
//        return products;
//    }

    public void initStoreItems() {
        String [] productNames = {"Bread", "Croissant", "Limonade","Milk","Pizza","Water"};
        Double [] productPrice = {3.00, 1.00, 1.20 , 1.00 , 2.50 , 1.00};
        Integer [] amount = {1, 6, 10,5,2,11,12};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], amount[i]));
        }
    }
}
package grocery.data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    @Column(name="NAME")
    private String productName;
    @Column(name="PRICE")
    private double productPrice;
    @Column(name="AMOUNT")
    private int amount;
    @Column(name="IMAGE")
    private String imageLocation;

    public Product() {
    }

    public Product(String productName, double productPrice, int amount, String imageLocation) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.amount = amount;
        this.imageLocation = imageLocation;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public Product(int i, String productName, Double aDouble, Integer integer) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAmount() {
        return amount;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.productName);
        hash = 29 * hash + Objects.hashCode(this.productPrice);
        hash = 29 * hash + Objects.hashCode(this.amount);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.productPrice, other.productPrice)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", amount=" + amount +
                ", imageLocation='" + imageLocation + '\'' +
                '}';
    }
}

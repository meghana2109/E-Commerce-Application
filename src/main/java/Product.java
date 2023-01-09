import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    
    public int productId;
    public String productName;
    public String productCategory;
    public String sellerName;
    public double costPrice;
    public double discount;
    public double sellingPrice;
}

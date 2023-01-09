import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seller {
    public int sellerId;
    public String sellerName;
    public String address;
    public String category;
    public String[] products;
}

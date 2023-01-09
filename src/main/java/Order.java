import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    public int orderId;
    public double amount;
    public int customerId;
    public int productId;
    public String paymentType;
    public String paymentStatus;
}

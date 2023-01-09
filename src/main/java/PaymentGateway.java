import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PaymentGateway {
    public int id;
    public String paymentType;
    public String  gatewayVendor;
    public String limit;

}

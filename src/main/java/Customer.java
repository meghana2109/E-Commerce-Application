import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    public int id;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNumber;
}

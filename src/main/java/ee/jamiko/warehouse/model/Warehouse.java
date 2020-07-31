package ee.jamiko.warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="warehouse")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Warehouse {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private long id;

    private Date dateSold;
    private String product;
    private String size;
    private BigDecimal salePrice;
    private BigDecimal purchasePrice;
    private BigDecimal shippingPrice;
    private BigDecimal profit;

}

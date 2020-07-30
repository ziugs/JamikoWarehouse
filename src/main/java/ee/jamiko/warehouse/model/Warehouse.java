package ee.jamiko.warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="warehouse")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Warehouse {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String dateSold;
    private String product;
    private String size;
    private float salePrice;
    private float purchasePrice;
    private float shippingPrice;
    private float profit;



}

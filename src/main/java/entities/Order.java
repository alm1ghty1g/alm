package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "order")


public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<LineItem> lineItems = new ArrayList<>();

}

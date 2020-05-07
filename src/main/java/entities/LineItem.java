package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "lineItem")

public class LineItem {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lineItem_id;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Order order;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Product product;



}

package entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;

    @Column(nullable = false)
    private String city;


    @Column(nullable = false)
    private String street;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    private List<User> users = new ArrayList<>();
}

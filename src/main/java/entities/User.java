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
@Table(name = "user")


public class User {


    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name = "login", length = 20, nullable = false, unique = true)
    private String login;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;

//    @Column(name = "firstName", length = 20, nullable = false)
//    private String firstName;
//
//    @Column(name = "lastName", length = 20, nullable = false)
//    private String lastName;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "address_id")
//    private Address address;
//
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.REMOVE)
//    private List<CreditCard> creditCards = new ArrayList<>();

    public User(String login, String password, String email) {
    }


//    public void addCreditCard(CreditCard card) {
//        creditCards.add(card);
//    }


    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", address=" + address.getCity() +
                '}';
    }
}

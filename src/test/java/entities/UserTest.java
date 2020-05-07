//package entities;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.hibernate.Session;
//
//
//public class UserTest {
//
//    private Session session;
//
//
//    private SessionManager sessionManager;
//
//    @Before
//    public void initSession() {
//        session = (Session) SessionManager.getFactory().openSession();
//        session.beginTransaction();
//    }
//
//    @After
//    public void commit() {
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Test
//
//    public void createUserTest() {
//
//        Address address = new Address();
//        address.setCity("stakan");
//        address.setStreet("bulkin");
//        session.save(address);
//
//
//        User user = new User();
//
//        user.setLogin("armen");
//        user.setPassword("ara");
//        user.setEmail("ara666@mail.com");
//        user.setFirstName("armen");
//        user.setLastName("gurganash");
//        user.setAddress(address);
//
//
//        session.save(user);
//
//        address.getUsers().add(user);
//        session.update(address);
//
//    }
//
//    @Test
//
//    public void createCardTest() {
//
//        CreditCard creditCard = new CreditCard();
//
//        creditCard.setNumber("123123123");
//
//        User user = session.get(User.class, 1);
//
//        session.save(creditCard);
//
//        user.addCreditCard(creditCard);
//
//        creditCard.setUser(user);
//
//
//    }
//
//
//}

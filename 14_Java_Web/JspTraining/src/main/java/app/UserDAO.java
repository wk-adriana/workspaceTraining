package app;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserDAO {

    public void addUser(User user) {
        EntityManager entityManager = UserEntityManager.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    public void removeUser(long id) {
        EntityManager entityManager = UserEntityManager.getEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        entityManager.getTransaction().commit();
    }

    public void updateUser(User user) {
        EntityManager entityManager = UserEntityManager.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
    }

    public List<User> getAllUsers() {
        List<User> userList ;
        EntityManager entityManager = UserEntityManager.getEntityManager();
        Query query = entityManager.createQuery("SELECT u FROM User u");
        userList = query.getResultList();
        return userList;
    }

    public User getUser(long id) {
        User user;
        EntityManager entityManager =  UserEntityManager.getEntityManager();
        user = entityManager.find(User.class, id);
        return user;
    }
}

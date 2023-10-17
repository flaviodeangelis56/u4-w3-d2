package flaviodeangelis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static flaviodeangelis.utils.JpaUtil.getEntityManagerFactory;

public class Application {
      private static final EntityManagerFactory emf = getEntityManagerFactory();



    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
    }
}

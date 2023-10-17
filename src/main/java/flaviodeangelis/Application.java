package flaviodeangelis;

import flaviodeangelis.entities.Evento;
import flaviodeangelis.entities.EventoDAO;
import flaviodeangelis.entities.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static flaviodeangelis.utils.JpaUtil.getEntityManagerFactory;

public class Application {
    private static final EntityManagerFactory emf = getEntityManagerFactory();


    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        try {
            EventoDAO eDAO = new EventoDAO(em);
            System.out.println("Hello World!");
            Evento test = new Evento("test1", "description of test1", TipoEvento.PRIVATO, 5);

            eDAO.save(test);
            Evento eventoByDB = eDAO.getById(1);
            System.out.println(eventoByDB);
            //eDAO.delate(1);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

    }
}

package flaviodeangelis.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {

    private final EntityManager em;

    public EventoDAO(EntityManager em){
        this.em = em;
    }

    public void save (Evento e) {
        EntityTransaction transaction = em.getTransaction();
transaction.begin();
em.persist(e);
transaction.commit();
        System.out.println("L'evento" + e + "salvato nel DB in modo corretto");
    }

    public Evento getById (long id) {
        return em.find(Evento.class, id);
    }
}

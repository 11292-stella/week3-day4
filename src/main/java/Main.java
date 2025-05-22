import Dao.EventoDao;
import Entities.Evento;
import Entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();

        EventoDao eventoDao = new EventoDao(em);

        Persona p1 = new Persona("Yoshi","Bros");
        Persona p2 = new Persona("Luigi","Bros");
        Persona p3 = new Persona("Peach","Princ");
    }
}

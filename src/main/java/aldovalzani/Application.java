package aldovalzani;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi_2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

    }
}

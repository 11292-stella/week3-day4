package Dao;

import Entities.Evento;
import jakarta.persistence.EntityManager;

public class EventoDao {

    private EntityManager em;

    public EventoDao(EntityManager em){
        this.em = em;
    }

    public void save(Evento evento){
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }

    public Evento getById(int id){
        return em.find(Evento.class,id);
    }

    public void remove(int id){

        Evento e = getById(id);

        if(e!=null) {
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        }
        else{
            System.out.println("non trovato" + e);
        }
    }
}

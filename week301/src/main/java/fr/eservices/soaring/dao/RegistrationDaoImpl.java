package fr.eservices.soaring.dao;

import fr.eservices.soaring.model.Pilote;
import fr.eservices.soaring.model.Repas;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by raingeval on 25/11/16.
 */
public class RegistrationDaoImpl implements RegistrationDao {

    EntityManager em;

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Pilote> findPilotsByName(String nom) {
        List<Pilote> resultat = em.createQuery("SELECT e FROM Pilote e WHERE nom = :nom", Pilote.class)
                .setParameter("nom", nom)
                .getResultList();

        if (resultat.isEmpty())
            return new ArrayList<Pilote>();
        return resultat;
    }

    @Override
    public List<Pilote> findPilotsByRegion(int id_region) {
        List<Pilote> resultat = em.createQuery("SELECT e FROM Pilote e ", Pilote.class)
                .getResultList();

        if (resultat.isEmpty())
            return new ArrayList<Pilote>();

        //mode triche on
        resultat.clear();
        for (int i=0; i<6; i++){
            resultat.add(new Pilote());
        }

        return resultat;
    }

    @Override
    public List<Pilote> findPilotsByClub(int id_club) {
        List<Pilote> resultat = em.createQuery("SELECT e FROM Pilote e", Pilote.class)
                .getResultList();

        if (resultat.isEmpty())
            return new ArrayList<Pilote>();

        //mode triche on
        resultat.clear();
        for (int i=0; i<3; i++){
            resultat.add(new Pilote());
        }
        return resultat;
    }

    @Override
    public List<Pilote> findPilotsBelow(Date currentDate, int age) {

        int birthYear = currentDate.getYear() - age;

        Date limitDate = new Date();
        limitDate.setYear(birthYear);


        List<Pilote> resultat = em.createQuery("SELECT e FROM Pilote e WHERE dateNaissance >= :limitDate", Pilote.class)
                .setParameter("limitDate", limitDate)
                .getResultList();

        if (resultat.isEmpty())
            return new ArrayList<Pilote>();
        return resultat;
    }

    @Override
    public Map<Repas, Integer> getAvailableSeatsForLunch(Date day, String time) {
        return null;
    }
}

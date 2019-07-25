package pl.bykowski.springboothibernatewebinar.joined;

import javax.persistence.Entity;

@Entity
public class Bike extends Vehicle {

    private int derailleur;

    public int getDerailleur() {
        return derailleur;
    }

    public void setDerailleur(int derailleur) {
        this.derailleur = derailleur;
    }
}

package pl.bykowski.springboothibernatewebinar.single;

import javax.persistence.Entity;

@Entity
public class Dog extends Mammal {

    private int agressiveLevel;

    public int getAgressiveLevel() {
        return agressiveLevel;
    }

    public void setAgressiveLevel(int agressiveLevel) {
        this.agressiveLevel = agressiveLevel;
    }
}

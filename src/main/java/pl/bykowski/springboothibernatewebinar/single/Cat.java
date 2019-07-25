package pl.bykowski.springboothibernatewebinar.single;

import javax.persistence.Entity;

@Entity
public class Cat extends Mammal {

    private int clawSize;

    public int getClawSize() {
        return clawSize;
    }

    public void setClawSize(int clawSize) {
        this.clawSize = clawSize;
    }
}

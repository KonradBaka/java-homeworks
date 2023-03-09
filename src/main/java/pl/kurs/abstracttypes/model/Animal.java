package pl.kurs.abstracttypes.model;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private Excitement excitement;

    public Animal(Excitement excitement) {
        this.excitement = excitement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Excitement getExcitement() {
        return excitement;
    }

    public void setExcitement(Excitement excitement) {
        this.excitement = excitement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && excitement == animal.excitement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, excitement);
    }
}

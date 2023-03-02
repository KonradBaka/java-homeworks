package pl.kurs.abstracttypes.model;

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


}

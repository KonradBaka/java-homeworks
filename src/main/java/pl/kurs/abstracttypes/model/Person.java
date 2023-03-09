package pl.kurs.abstracttypes.model;

import java.util.Objects;

public class Person implements AnimalOwner {

    private String firstName;
    private Animal ownedAnimal;


    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void feedTheAnimal() {
        ownedAnimal.setExcitement(Excitement.CALM);
        System.out.println(firstName + " daje jedzonko " + ownedAnimal.getName() + "wi. " + ownedAnimal.getExcitement().toString());
    }

    @Override
    public void playWithAnimal() {
        ownedAnimal.setExcitement(Excitement.HAPPY);
        System.out.println(firstName + " bawi się z " + ownedAnimal.getName() + ". " + ownedAnimal.getExcitement().toString());

    }

    @Override
    public void yellingAtTheAnimal() {
        ownedAnimal.setExcitement(Excitement.SAD);
        System.out.println(firstName + " krzyczy na " + ownedAnimal.getName() + ". " + ownedAnimal.getExcitement().toString());

    }

    @Override
    public void patTheAnimal() {
        ownedAnimal.setExcitement(Excitement.AGGRESSIVE);
        System.out.println(firstName + " napierdala sie z " + ownedAnimal.getName() + ". " + ownedAnimal.getExcitement().toString());
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setOwnedAnimal(Animal ownedAnimal) {
        this.ownedAnimal = ownedAnimal;
    }

    public Animal getOwnedAnimal() {
        return ownedAnimal;
    }


    @Override
    public void printInfo() {
        System.out.println(firstName + " posiada zwierzaka o imieniu " + ownedAnimal.getName() + ". Aktualnie " + ownedAnimal.getExcitement().toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(ownedAnimal, person.ownedAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, ownedAnimal);
    }
}

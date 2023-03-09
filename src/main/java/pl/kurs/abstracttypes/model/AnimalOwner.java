package pl.kurs.abstracttypes.model;

public interface AnimalOwner {

    void feedTheAnimal();

    void playWithAnimal();

    void yellingAtTheAnimal();

    void patTheAnimal();

    static void adoptTheAnimal(Person owner, Animal animalToAdopt, String animalName) {
        owner.setOwnedAnimal(animalToAdopt);
        animalToAdopt.setName(animalName);
    }


    default void printInfo() {
        System.out.println("Chuja moge zrobić ;x");
    }
}






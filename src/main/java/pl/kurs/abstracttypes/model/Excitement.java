package pl.kurs.abstracttypes.model;

public enum Excitement {
    AGGRESSIVE("Zwierzak jest zajebiście wkurwiony"),
    SAD("Zwierzak jest smutny"),
    CALM("Zwierzak jest spokojny"),
    HAPPY("Zwierzak jest szczęśliwy");

    private final String description;

    Excitement(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}

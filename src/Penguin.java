import java.util.Objects;

public class Penguin {
    private final String species;
    private final int population;

    public Penguin(String species, int population) {
        this.species = species;
        this.population = population;
    }

    public boolean equals(Object object) {
        if (object instanceof Penguin penguin) {
            return Objects.equals(species, penguin.species) && population == penguin.population;
        }
        return false;
    }

    public String getSpecies() {
        return species;
    }

    public int getPopulation() {
        return population;
    }
}
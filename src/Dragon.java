import java.util.Objects;

public class Dragon {
    private final String name;
    private final int heroesDefeated;

    public Dragon(String name, int heroesDefeated) {
        this.name = name;
        this.heroesDefeated = heroesDefeated;
    }

    public boolean equals(Object object) {
        if (object instanceof Dragon dragon) {
            return Objects.equals(name, dragon.name) && heroesDefeated == dragon.heroesDefeated;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getHeroesDefeated() {
        return heroesDefeated;
    }
}

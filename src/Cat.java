import java.util.Objects;

public class Cat {
    private final String name;
    private final int hoursUntilFed;

    public Cat(String name, int hoursUntilFed) {
        this.name = name;
        this.hoursUntilFed = hoursUntilFed;
    }

    public boolean equals(Object object) {
        if (object instanceof Cat cat) {
            return Objects.equals(name, cat.name) && hoursUntilFed == cat.hoursUntilFed;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getHoursUntilFed() {
        return hoursUntilFed;
    }
}

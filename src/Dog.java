import java.util.Objects;

public class Dog {
    private final String name;
    private final int sticksFetched;

    public Dog(String name, int sticksFetched) {
        this.name = name;
        this.sticksFetched = sticksFetched;
    }

    public boolean equals(Object object) {
        if (object instanceof Dog dog) {
            return Objects.equals(name, dog.name) && sticksFetched == dog.sticksFetched;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getSticksFetched() {
        return sticksFetched;
    }
}
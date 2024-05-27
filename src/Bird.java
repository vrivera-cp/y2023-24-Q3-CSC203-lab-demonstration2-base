import java.util.Objects;

public class Bird {
    private final String color;
    private final double songPitch;

    public Bird(String color, int songPitch) {
        this.color = color;
        this.songPitch = songPitch;
    }

    public boolean equals(Object object) {
        if (object instanceof Bird bird) {
            return Objects.equals(color, bird.color) && Objects.equals(songPitch, bird.songPitch);
        }
        return false;
    }

    public String getColor() {
        return color;
    }

    public double getSongPitch() {
        return songPitch;
    }
}
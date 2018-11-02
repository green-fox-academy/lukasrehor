import java.time.Duration;
import java.time.LocalDateTime;

class Task {
    private boolean completed;
    private int id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    Task (boolean completed, int id, String description, String created, String completedAt) {
        this.completed = completed;
        this.id = id;
        this.description = description;
        this.createdAt = LocalDateTime.parse(created);
        if (completed) {
            this.completedAt = LocalDateTime.parse(completedAt);
        } else {
            this.completedAt = null;
        }
    }

    private Duration durationFn() {
        return Duration.between(createdAt,completedAt);
    }
    private String bracketsXFn () {
        if (completed) return " - [X] ";
        else return " - [ ] ";
    }
    String toStringg() {
        return String.valueOf(id + bracketsXFn() + description + " |created: " + createdAt + " |finished: " + completedAt + " |duration: " + durationFn());
    }

    private Integer bool () {
        if (completed) return 1;
        else return 0;
    }
    String savelines() {
        return String.valueOf(bool() + ";" + id +  ";" + description + ";" + createdAt + ";" + completedAt);
    }
}
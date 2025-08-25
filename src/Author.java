import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;

    }

    public String getLastName() {
        return this.lastName;

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return Objects.equals(name, c2.name) &&
                Objects.equals(lastName, c2.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Имя автора - " + this.name + ", Фамилия автора - " + this.lastName;
    }
}

import java.util.Objects;

public class Book {
    private int publicationYear;
    private String bookName;
    private Author author;

    public Book(Author author, int publicationYear, String bookName) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.bookName = bookName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        String pubYear = String.valueOf(publicationYear);

        return Objects.equals(publicationYear, c2.publicationYear) &&
                Objects.equals(bookName, c2.bookName) && Objects.equals(author, c2.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publicationYear, author);
    }

    @Override
    public String toString() {
        return this.author + " Год публикации книги - " + this.publicationYear + ", Название книги - " + this.bookName;
    }
}

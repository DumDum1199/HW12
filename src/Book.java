import java.util.Objects;

public class Book {
    private int publicationYear;
    private String bookName;
    Author author;

    public Book(Author author, int publicationYear, String bookName) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.bookName = bookName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return this.author + " Год публикации книги - " + this.publicationYear + ", Название книги - " + this.bookName;
    }


}

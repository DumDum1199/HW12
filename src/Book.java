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
}

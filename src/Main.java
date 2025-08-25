//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Курт", "Воннегут");
        Author author2 = new Author("Оскар", "Уайльд");
        Book book = new Book(author, 1969, "Бойня №5");
        Book book2 = new Book(author, 1980, "Портрет Дориана Грея");
        book2.setPublicationYear(1999);
        System.out.println(book2);
        System.out.println(author.equals(author2));
        System.out.println(book.equals(book2));
    }
}

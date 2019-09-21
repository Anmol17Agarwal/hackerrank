import java.util.Scanner;
public class Magic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers of Books");
        int a = scanner.nextInt();
        Books[] book= new book[a];
        if (a > 0 ) {
            for (int i = 0; i < a; i++) {
                String bookName = scanner.nextLine().trim();
                String authorName = scanner.nextLine().trim();
                long isbn = scanner.nextLong();
                scanner.nextLine().trim();

                book[i] = new Player(bookName, authorName, isbn);

            }
            String header = String.format("%10s\t10s\t10s\t10s", "BookName", "AuthorName", "ISBN");
            System.out.println(header);
            //enhanced-for loop OR for each-loop
            for (Books books: book) {
                System.out.println(book);
        }
    }
}
public class Books {
    private String bookName;
    private String authorName;
    private long isbn;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Books(String bookName, String authorName, long isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book Name:\t" + getBookName() + "\nAuthor Name:\t" + getAuthorName() + "\nISBN:\t" + getIsbn();
    }
}

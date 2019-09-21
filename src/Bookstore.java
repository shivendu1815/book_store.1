import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_books = scanner.nextInt();
        if (number_of_books == 0) {
            System.out.println("N/A");
        } else {
            String bookname = "";
            String authorname = "";
            long isbn;
            for (int i = 1; i <= number_of_books; i++) {
                scanner.skip("\n");
                bookname = scanner.nextLine();
                authorname = scanner.nextLine();
                isbn = scanner.nextLong();

                System.out.println("------------------------");
                System.out.println("Book Name:" + bookname);
                System.out.println("Author Name:" + authorname);
                System.out.println("ISBN:" + isbn);
                System.out.println("------------------------");
            }
        }

    }
}

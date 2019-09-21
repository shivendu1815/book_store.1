import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_books = scanner.nextInt();
        if (number_of_books == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 1; i <= number_of_books; i++) {
                String book_name = scanner.nextLine();
                String author_name = scanner.nextLine();
                double isbn = scanner.nextDouble();
            }


        }

    }
}

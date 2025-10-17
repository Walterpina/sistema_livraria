import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        List<GravarEmprestimo> emprestimos = new ArrayList<>();

        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        while(true){
            System.out.println("Options: 1) View books; 2) View borrowing history; 3) Exit;");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if(option == 1){
                System.out.println("List of books:");
                Livro[] livrosDisponiveis = biblioteca.getLivrosDisponiveis();
                for(Livro livro : livrosDisponiveis){
                    System.out.println("ID: " + livro.getId() + ", Title: " + livro.getTitulo() + ", Author: " + livro.getAutor() + ", Available: " + livro.isDisponivel());
                }

                System.out.println("Enter the ID of the book you want to borrow: ");
                int bookId = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Livro selectedBook = null;
                for(Livro livro : livrosDisponiveis){
                    if(livro.getId() == bookId){
                        selectedBook = livro;
                        break;
                    }
                }

                if(selectedBook != null && selectedBook.isDisponivel()){
                    selectedBook.setDisponivel(false);
                    GravarEmprestimo novoEmprestimo = new GravarEmprestimo(userName, selectedBook.getTitulo(), selectedBook.getAutor());
                    emprestimos.add(new GravarEmprestimo(userName, selectedBook.getTitulo(), selectedBook.getAutor()));
                    System.out.println("You have borrowed: " + selectedBook.getTitulo() + " by " + selectedBook.getAutor());
                } else {
                    System.out.println("Invalid book ID or book not available.");
                }

            } else if (option == 2) {
                System.out.println("Your borrowing history:");
                for(GravarEmprestimo emprestimo : emprestimos){
                    System.out.println(emprestimo);
                }

            } else if (option == 3) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");

            }

        }

        scanner.close();


    }
}
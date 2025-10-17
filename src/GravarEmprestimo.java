public class GravarEmprestimo {
    private String userName;
    private String bookTitle;
    private String bookAuthor;

    public GravarEmprestimo(String userName, String bookTitle, String bookAuthor) {
        this.userName = userName;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "User: " + userName + ", Book: " + bookTitle + ", Author: " + bookAuthor;
    }
}

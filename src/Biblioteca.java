import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        Autor autor1 = new Autor(1,"Khalil Gibran", "06/01/1883");
        Autor autor2 = new Autor(2,"George Orwell", "25/06/1903");
        autores.add(autor1);
        autores.add(autor2);

        Livro livro1 = new Livro(1, "O Profeta", autor1.getNome(), true, "01/01/2020", "01/01/2020");
        Livro livro2 = new Livro(2, "1984", autor2.getNome(), true, "01/02/2020", "01/02/2020");
        livros.add(livro1);
        livros.add(livro2);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public Livro[] getLivrosDisponiveis() {
        return livros.stream().filter(Livro::isDisponivel).toArray(Livro[]::new);
    }
}

public class Emprestimo {

    private int id;
    private Livro livro;
    private String nomeCliente;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int id, Livro livro, String nomeCliente, String dataEmprestimo, String dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    public int getId() {
        return id;
    }
    public Livro getLivro() {
        return livro;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public String getDataDevolucao() {
        return dataDevolucao;
    }
}

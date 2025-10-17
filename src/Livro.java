public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;
    private String dataCadastro;
    private String dataAtualizacao;

    public Livro(int id, String titulo, String autor, boolean disponivel, String dataCadastro, String dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public String getDataCadastro(){
        return dataCadastro;
    }
    public String getDataAtualização(){
        return dataAtualizacao;
    }


    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

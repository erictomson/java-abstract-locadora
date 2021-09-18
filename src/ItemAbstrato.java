public abstract class ItemAbstrato {
    // Atributos privados da classe
    private int codigo;
    private String titulo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String situacaoItem; //L: Livre | E: Emprestado

    // Getters e Setters dos atributos da classe
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getSituacaoItem() {
        return situacaoItem;
    }

    public void setSituacaoItem(String situacaoItem) {
        this.situacaoItem = situacaoItem;
    }

    // Métodos abstratos a serem implementados nas subclasses
    public abstract void cadastrar();

    public abstract void emprestar();

    public abstract void devolver();

}

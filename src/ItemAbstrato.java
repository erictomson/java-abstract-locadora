public abstract class ItemAbstrato {
    // Atributos privados da classe
    private int codigo;
    private String titulo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String situacaoItem; //L: Livre | E: Emprestado

    // Métodos abstratos a serem implementados nas subclasses
    public abstract void cadastrar();

    public abstract void emprestar();

    public abstract void devolver();
}

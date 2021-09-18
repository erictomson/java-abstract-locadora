import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato {
    // Classe SimpleDateFormat para tratar datas observando o locale
    // (configurações regionais do sistema operacional)
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // Construtor da classe
    public Dvd() {}


    // Implementação (sobreescrita) de métodos
    // definidos na superclasse ItemAbstrato
    // @Override: anotação para indicar uma sobreescrita de método
    // definido na superclasse (e não um novo método na subclasse atual)
    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("Senhor dos Anéis");
        setSituacaoItem("L");
        System.out.println("DVD Cadastrado: " +
                        " - Código: " + getCodigo() +
                        " - Título: " + getTitulo() +
                        " - Situação: " + getSituacaoItem());
        System.out.println("DVD cadastrado utilizando método abstrato " +
                            "herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void emprestar() {
        setSituacaoItem("E");
        setDataEmprestimo(sdf.format(new Date()));
        System.out.println("DVD emprestado: " +
                        " - Situação: " + getSituacaoItem() +
                        " - Data Empréstimo: " + this.getDataEmprestimo());
        System.out.println("DVD emprestrado utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void devolver() {
        setSituacaoItem("E");
        setDataDevolucao(sdf.format(new Date()));
        System.out.println("DVD devolvido: " +
                " - Situação: " + getSituacaoItem() +
                " - Data Devolução: " + this.getDataEmprestimo());
        System.out.println("DVD devolvido utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }

    // Métodos específicos da classe DVD
    // Imprimir lista de DVDs
    public void imprimir() {
        System.out.println("Imprimir Lista de DVDs utilizando método" +
                "concreto da classe DVD");
    }

    // Retorna uma instância da classe DVD
    // Dispensa criação de um objeto
    public static Dvd getInstance() {
        return new Dvd();
    }

}

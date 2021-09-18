// Classe CDs herda de DVDs que, por sua vez, herda de ItemAbstrato
// Portanto, a classe CDs pode reutilizar todos os atributos e
// métodos de ambas as classes e implementar suas próprias especificidades
public class Cds extends Dvd {

    // Implementação (sobreescrita) de métodos
    // definidos na superclasse Dvd
    // @Override: anotação para indicar uma sobreescrita de método
    // definido na superclasse (e não um novo método na subclasse atual)

    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("The Best of Joy Division");
        setSituacaoItem("L");
        System.out.println(" ");
        System.out.println("CD Cadastrado: " +
                " - Código: " + getCodigo() +
                " - Título: " + getTitulo() +
                " - Situação: " + getSituacaoItem());
        System.out.println("CD cadastrado utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }

    //Sobreescrita do método concreto da classe DVD
    @Override
    public void imprimir() {
        System.out.println("Impressão da Lista de CDs método " +
                "herdado da classe DVD");
    }

    // Método concreto da classe CD
    public void vender() {
        System.out.println("CD vendido utilizando método " +
                "concreto da classe CDs");
    }

    // Retorna uma instância da classe CD
    // Dispensa criação de um objeto
    public static Cds getInstance() {
        return new Cds();
    }
}

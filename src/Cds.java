public class Cds extends Dvd {

    // Implementação (sobreescrita) de métodos
    // definidos na superclasse Dvd
    // @Override: anotação para indicar uma sobreescrita de método
    // definido na superclasse (e não um novo método na subclasse atual)

    @Override
    public void vender() {}

    @Override
    public void cadastrar() {}

    //Método específico da classe CDs
    public void imprimir() {}

    // public Cds getInstance() {}
}

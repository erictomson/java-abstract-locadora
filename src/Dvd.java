public class Dvd extends ItemAbstrato {

    // Construtor da classe
    public Dvd() {}

    // Método específico da classe DVD
    public void vender() {}

    // Implementação (sobreescrita) de métodos
    // definidos na superclasse ItemAbstrato
    // @Override: anotação para indicar uma sobreescrita de método
    // definido na superclasse (e não um novo método na subclasse atual)
    @Override
    public void emprestar() {}

    @Override
    public void cadastrar() {}

    @Override
    public void devolver() {}

    //public Dvd getInstance() {}
}

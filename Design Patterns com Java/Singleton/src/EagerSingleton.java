public class EagerSingleton {

    private static EagerSingleton instancia = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstancia(){
        return instancia;
    }
}

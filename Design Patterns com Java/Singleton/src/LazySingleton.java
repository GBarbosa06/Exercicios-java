
public class LazySingleton {

    private static LazySingleton instancia;

    private LazySingleton(){

    }

    public static LazySingleton getInstancia(){
        if (instancia == null) {
            instancia = new LazySingleton();
        }
        return instancia;
    }

}

package subsistema2.cep;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI(){

    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Brasilia";
    }
    
    public String recuperarEstado(String cep){
        return "DF";
    }
}

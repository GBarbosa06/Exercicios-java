public class AparelhoTelefonico {
    private boolean emChamada = false;

    public void ligar(String numero){
        if (emChamada) {
            System.out.println("Já está em chamada... biiip");
            return;
        }
        System.out.println("Ligando para: " + numero + "...");
    }

    public void atender(){
        if (emChamada) {
            System.out.println("Já está em chamada... biiip");
            return;
        }
        int random = (int) (Math.random() * 2) + 1;

        if (random == 1) {
            System.out.println("Atendendo a ligação");
        }else {
            System.out.println("Não há ninguém ligando");
        }

    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }



}

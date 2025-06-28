public class ReprodutorMusical {
    
    private String musica;
    private boolean tocando = false;
    

    public void tocar(){
        if(tocando){
            System.out.println("A música já está tocando!");
            return;
        }
        if(musica == null || musica.isEmpty()){
            System.out.println("Selecione uma música primeiro!");
        }
        else {
            System.out.println("Tocando a música: " + musica);
            tocando = true;
        }
    }
    public void pausar(){
        if(tocando){
            System.out.println("Pausando a música: " + musica);
            tocando = false;
        } else {
            System.out.println("A música não está tocando!");
        }
    }
    public void selecionarMusica(String musica){
        if (tocando) {
            System.out.printf("Trocando %s por %s... \n", this.musica, musica);
        }
        else{
            System.out.println("Tocando agora: " + musica);
        }
        try {
            this.musica = musica;
            tocando = true;
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println("Houve uma interrupção, tente novamente mais tarde!");
        }
        System.out.printf("Tocando agora: %s\n", musica);
        
    }
}

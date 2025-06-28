public class NavegadorNaInternet {
    private String url;
    private boolean abaAberta = false;
    public void exibirPagina(String url){
        System.out.println("Abrindo página...");
        if (!abaAberta) {
            System.err.println("Nenhuma aba aberta");
            return;
        }
        try {
            Thread.sleep(1000);
            System.out.println("Pagina aberta com sucesso: " + url);
            this.url = url;
        } catch (Exception e) {
            System.err.println("Houve uma interrupção");
        }
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba criada!");
        abaAberta = true;
    }
    public void atualizarPagina(){
        if (!abaAberta) {
            System.err.println("Nenhuma aba aberta");
            return;
        }
        System.out.println("Atualizando a página...");
        try {
            Thread.sleep(1000);
            System.out.printf("Pagina %s atualizada com sucesso! \n", url);
        } catch (Exception e) {
            System.err.println("Houve uma interrupção");
        }

    }
}

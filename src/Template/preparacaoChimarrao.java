package Template;

public class preparacaoChimarrao extends preparacaoBebida{

	@Override
    void esquentarAgua() {
        System.out.println("Esquentando �gua para o chimarr�o");
    }

    @Override
    void prepararIngredientes() {
        System.out.println("Colocando erva na cuia");
    }

    @Override
    void despejarRecipiente() {
        System.out.println("Despejando �gua na cuia");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando ch� ao chimarr�o");
    }
    
}

package Template;

public class preparacaoChimarrao extends preparacaoBebida{

	@Override
    void esquentarAgua() {
        System.out.println("Esquentando água para o chimarrão");
    }

    @Override
    void prepararIngredientes() {
        System.out.println("Colocando erva na cuia");
    }

    @Override
    void despejarRecipiente() {
        System.out.println("Despejando água na cuia");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando chá ao chimarrão");
    }
    
}

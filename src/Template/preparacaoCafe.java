package Template;

public class preparacaoCafe extends preparacaoBebida{

	@Override
    void esquentarAgua() {
        System.out.println("Fervendo �gua para o caf�");
    }

    @Override
    void prepararIngredientes() {
        System.out.println("Colocando p� do caf� na x�cara");
    }

    @Override
    void despejarRecipiente() {
        System.out.println("Despejando �gua na x�cara");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando a��car e leite ao caf�");
    }
    
}

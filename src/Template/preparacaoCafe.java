package Template;

public class preparacaoCafe extends preparacaoBebida{

	@Override
    void esquentarAgua() {
        System.out.println("Fervendo água para o café");
    }

    @Override
    void prepararIngredientes() {
        System.out.println("Colocando pó do café na xícara");
    }

    @Override
    void despejarRecipiente() {
        System.out.println("Despejando água na xícara");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite ao café");
    }
    
}

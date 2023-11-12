package Template;

abstract class preparacaoBebida {
	
	abstract void esquentarAgua();

    abstract void prepararIngredientes();

    abstract void despejarRecipiente();

    abstract void adicionarCondimentos();
    
    // Template
    public final void prepararBebida() {
        esquentarAgua();
        prepararIngredientes();
        despejarRecipiente();
        adicionarCondimentos();
    }

}

package Template;

public class templateMain {
	
	public static void main(String[] args) {
        preparacaoBebida preparacaoCafe = new preparacaoCafe();
        preparacaoBebida preparacaoCha = new preparacaoChimarrao();

        System.out.println("Prepara��o do caf�:");
        preparacaoCafe.prepararBebida();

        System.out.println("\nPrepara��o do chimarr�o:");
        preparacaoCha.prepararBebida();
    }

}

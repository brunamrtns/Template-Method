package Template;

public class templateMain {
	
	public static void main(String[] args) {
        preparacaoBebida preparacaoCafe = new preparacaoCafe();
        preparacaoBebida preparacaoCha = new preparacaoChimarrao();

        System.out.println("Preparação do café:");
        preparacaoCafe.prepararBebida();

        System.out.println("\nPreparação do chimarrão:");
        preparacaoCha.prepararBebida();
    }

}

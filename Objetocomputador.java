package dia21;

public class Objetocomputador {

	public static void main(String[] args) {
		Computador computador1 = new Computador();

	    computador1.setMarca("positivo");
	    computador1.setModelo("lg");
	    computador1.setCor("pretinho");
	    computador1.setTamanhoTela(17);

	    System.out.println("-----Computador 1!-----");
	    System.out.println("Marca: " + computador1.getMarca());
	    System.out.println("Modelo: " + computador1.getModelo());
	    System.out.println("Cor: " + computador1.getCor());
	    System.out.println("Tamanho da Tela: " + computador1.getTamanhoTela() + " polegadas");

	    System.out.println(computador1.ligar());
	}

}

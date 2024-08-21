package dia21;

public class Computador {
	    private String marca;
	    private String modelo;
	    private String cor;
	    private int tamanhoTela;

	    public Computador() {
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public int getTamanhoTela() {
	        return tamanhoTela;
	    }

	    public void setTamanhoTela(int tamanhoTela) {
	        this.tamanhoTela = tamanhoTela;
	    }

	    public String ligar() {
	        return "Ligando";
	    }

	    public String desligar() {
	        return "Desligando";
	    }

	    public String reiniciar() {
	        return "Reiniciando";
	    }
	}


package dados_retangulo;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double Area() {
		return altura * largura;
	}
	public double Perimetro() {
		return (largura + altura) * 2;
	}
	public double Diagonal() {
		return Math.sqrt(altura * largura + altura * largura);
	}
}

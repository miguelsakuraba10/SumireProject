public class Vendedor extends Funcionario{
	float comissaoAt;
	
	public Vendedor(float idAt, String nomeAt, float salarioAt, float comissaoAt) {
		super(idAt, nomeAt, salarioAt);
		this.comissaoAt = comissaoAt;
	}
	
	public void exibirInfo() {
		System.out.println("");
	}
	public float calcularSalarioTotal(){
		return salarioAt;
		return comissaoAt;
	}
}
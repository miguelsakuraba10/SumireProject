public class Vendedor extends Funcionario{
	float comissaoAt;
	
	public Vendedor(float idAt, String nomeAt, float salarioAt, float comissaoAt) {
		super(idAt, nomeAt, salarioAt);
		this.comissaoAt = comissaoAt;
	}
	
	public void exibirInfo() {
		System.out.println("ID: " + idAt);
		System.out.println("Nome: " + nomeAt);
		System.out.println("Salario: " + salarioAt);
	}

	@Override
	public float calcularSalario(){
		return salarioAt * bonusAt;
	}
}
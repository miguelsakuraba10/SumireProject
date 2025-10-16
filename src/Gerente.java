public class Gerente extends Funcionario{
	String bonusAt;
	
	public Gerente(float idAt, String nomeAt, float salarioAt) {
		super(idAt, nomeAt, salarioAt);
	}
	
	public void exibirInfo() {
		System.out.println("");
	}
	public float calcularSalarioTotal(){
		return salarioAt;
	}
}
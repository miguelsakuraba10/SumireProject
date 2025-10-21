public class Gerente extends Funcionario{
	float bonusAt;
	
	public Gerente(float idAt, String nomeAt, float salarioAt) {
		super(idAt, nomeAt, salarioAt);
	}
	
	// Annotation
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("ID: " + idAt + "do usuário");
		System.out.println("Nome: " + nomeAtm + "do usuário");
		System.out.println("Salário: " + salarioAt + "do usuário");
	}
}
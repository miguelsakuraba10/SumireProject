public class Funcionario {
	float idAt;
	String nomeAt;
	float salarioAt;
	public Funcionario(float idAt, String nomeAt, float salarioAt) {
		super();
		this.idAt = idAt;
		this.nomeAt = nomeAt;
		this.salarioAt = salarioAt;
	}
	public float getIdAt() {
		return idAt;
	}

	public void setIdAt(float idAt) {
		this.idAt = idAt;
	}

	public String getNomeAt() {
		return nomeAt;
	}

	public void setNomeAt(String nomeAt) {
		this.nomeAt = nomeAt;
	}

	public float getSalarioAt() {
		return salarioAt;
	}

	public void setSalarioAt(float salarioAt) {
		this.salarioAt = salarioAt;
	}
	
	public void exibirInfo() {
		System.out.println("ID: " + idAt);
		System.out.println("Nome: " + nomeAt);
		System.out.println("Salario: " + salarioAt);
	}
	
	public float calcularSalarioTotal(){
		return salarioAt;
	}
}
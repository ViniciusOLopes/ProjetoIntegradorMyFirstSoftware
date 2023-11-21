package interfaces;

public interface Usuario {
	//Modificando tipo de senha de double para String
	
	public  void Cadastrar(String dataNascimento, String nome, double cpf, double cnh,
			double telefone, String endereco, String senha);
		
	public void DeletarConta();
	
	public boolean Login(String senha, double id);
	

	//Retirando os gets da interface:
	
	/*String getDataNascimento();
	String getNome();
	double getCpf();
	double getCnh();
	double getTelefone();
	String getEndereco();
	String getSenha();
	*/
}

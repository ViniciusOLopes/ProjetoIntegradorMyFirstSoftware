package classes;
import java.util.ArrayList;
import interfaces.Usuario;

public class Empresa implements Usuario {
	private String dataNascimento;
	private String endereco;
	private double cnpj;
	private double cnh;
	private String nome;
	
	private double telefone;
	//Mudando o tipo de variavel da senha de double para string( para se possivel guardar caracteres nela tambem);
	private String senha;
	//Adicionando uma lista de empregados
	private ArrayList<Entregador> ent;
	
	//Implementando um novo construtor que nao implenente dados do entregador;
	public Empresa(String nome, double cnh, double telefone, String senha, String endereco, ArrayList<Entregador> ent) {
		setNome(nome);
		setCnh(cnh);
		setEndereco(endereco);
		setTelefone(telefone);
		setSenha(senha);
		setEntregadores(ent);
	}
	
	@SuppressWarnings("unused")
	private Empresa(String dataNascimento, String nome, double cpf, double cnh, 
			double telefone, String endereco, String senha) {
		this.dataNascimento = dataNascimento;
		this.cnh = cnh;
		this.cnpj = cpf;
		this.endereco = endereco;
		this.nome = nome;
		this.senha = senha;
		this.telefone = telefone;
		
	}
	
public Empresa() {
		
	}
	public String getDataNascimento() {
		return dataNascimento;
	} 	
		public String getEndereco() {
		return endereco;
	}
	public double getCpf() {
		return cnpj;
	}
	public double getCnh() {
		return cnh;
	}
	public double getTelefone() {
		return telefone;
	}
	public String getNome() {
		return nome ;
	}
	public String getSenha() {
		return senha;
	}
	public ArrayList<Entregador> getEntregadores(){
		return this.ent;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public void setCnh(double cnh) {
		this.cnh = cnh;
	}
	public void setCpf(double cpf) {
		this.cnpj = cpf;
	}
	public void setEndereco(String  endereco) {
		this.endereco = endereco;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setEntregadores(ArrayList<Entregador> ent) {
		this.ent = ent;
	}
	
	public void Cadastrar(String dataNascimento, String nome, double cpf, double cnh, double telefone, String endereco, String senha) {
		this.dataNascimento = null;
		this.cnh = 0;
		this.cnpj = cpf;
		this.endereco = endereco;
		this.nome = nome;
		this.senha = senha;
		this.telefone = telefone;
		
		System.out.println("Cadastro realizado ...");
	}

	@Override
	public void DeletarConta() {
		this.dataNascimento = null;
		this.cnh = 0;
		this.cnpj = 0;
		this.endereco = null;
		this.nome = null;
		this.senha = null;
		this.telefone =0;
		
		System.out.println(" Conta apagada...");
		
	}

	public boolean Login(String senha, double cpf) {
		
		return this.cnpj == cnpj && this.senha == senha;		
	}
	
	public String ToString() {
		return "Data de nascimento: " + this.dataNascimento + "Nome: "+ this.nome 
		+ "CNPJ:" + this.cnpj + "CNH: " + this.cnh + "Telefone:" + this.telefone + "Endereco" 
				+ this.endereco;
	}
}

package classes;

import interfaces.Usuario;
import java.util.ArrayList;

public class Entregador implements Usuario {
	
	private String dataNascimento;
	private String endereco;
	private double cpf;
	private double cnh;
	private String nome;
	private double telefone;
	//Mudando senha de double para String;
	private String senha;
	//Adicionando lista de empresa cadastradas;
	private ArrayList<Empresa> emp;
	//Adicionando lista de veiculos;
	private ArrayList<Veiculo> veiculos;
	
	public Entregador() {
		
	}
	
	//Adicionando Lista de empresas para o construtor;
	public Entregador(String nome, String senha, String endereco, String dataNascimento, double telefone, double cpf, 
			double cnh, ArrayList<Empresa> emp, ArrayList<Veiculo> veiculo) {
		setNome(nome);
		setTelefone(telefone);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setCpf(cpf);
		setCnh(cnh);
		setSenha(senha);
		setListaEmpresa(emp);
		setListaVeiculo(veiculo);
		
	}	

	public String getDataNascimento() {
		return dataNascimento;
	} 	
	public String getEndereco() {
		return endereco;
	}
	public double getCpf() {
		return cpf;
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
	//Sets para as listas de empresa e de veiculo;
	public ArrayList<Empresa> getListaDeEmpresas(){
		return this.emp;
	}
	public ArrayList<Veiculo> getListaVeiculo(){
		return this.veiculos;
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
		this.cpf = cpf;
	}
	public void setEndereco(String  endereco) {
		this.endereco = endereco;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	//Sets para as listas de empresa e de veiculo;
	public void setListaEmpresa(ArrayList<Empresa>emp) {
		this.emp = emp;
	}
	public void setListaVeiculo(ArrayList<Veiculo>veiculo) {
		this.veiculos = veiculo;
	}

	public void Cadastrar(String dataNascimento, String nome, double cpf, double cnh, double telefone, String endereco, String senha) {
		setNome(nome);
		setTelefone(telefone);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setCpf(cpf);
		setCnh(cnh);
		setSenha(senha);
		
		System.out.println("Cadastro realizado ...");		
	}

	@Override
	public void DeletarConta() {
		setNome(null);
		setTelefone(0);
		setDataNascimento(null);
		setEndereco(null);
		setCpf(0);
		setCnh(0);
		setSenha(null);
		
		System.out.println(" Conta apagada...");		
	}

	public boolean Login(String senha, double cpf) {	
		return getCpf() == cpf && getSenha()== senha;
	}
	
	public String ToString() {
		return "Data de nascimento: " + this.dataNascimento + "Nome: "+ this.nome 
		+ "CPF:" + this.cpf + "CNH: " + this.cnh + "Telefone:" + this.telefone + "Endereco" 
				+ this.endereco;
	}
}

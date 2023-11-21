package classes;

import interfaces.Pedido;

public class DadoPedido implements Pedido {
	
	private String enderecoSaida;
	private String enderecoChegada;
	private String nomeCliente;
	private double telefoneCliente;
	private String statusPedido;
	private int numPedido;
	
	public DadoPedido(String enderecoSaida, String enderecoChegada, 
			String nomeCliente, double telefoneCliente, String statusPedido, int numPedido) {

		this.enderecoSaida = enderecoSaida;
		this.enderecoChegada = enderecoChegada;
		this.nomeCliente = nomeCliente;
		this.telefoneCliente = telefoneCliente;
		this.statusPedido = statusPedido;
		this.numPedido = numPedido;
		
	}
	
	public DadoPedido() {
		
	}
	
	public String getEnderecoSaida() {
		return enderecoSaida;
	}
	
	public String getEnderecoChegada() {
		return enderecoChegada;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public double getTelefoneCliente() {
		return telefoneCliente;
	}
	
	public String getStatusPedido() {
		return statusPedido;
	}
	
	public int getNumPedido() {
		return numPedido;
	}
	
	public void setEnderecoSaida(String enderecoSaida ) {
		this.enderecoSaida = enderecoSaida;
	}
	
	public void setEnderecoChegada(String enderecoChegada) {
		this.enderecoChegada = enderecoChegada;
	}
	
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	public void setTelefoneCliente(double telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	

	
	public void Localizacao(String enderecoSaida, String enderecoChegada, String nomeCliente,
			double telefoneCliente, int numPedido) {
		this.enderecoSaida = enderecoSaida;
		this.enderecoChegada = enderecoChegada;
		this.nomeCliente = nomeCliente;
		this.telefoneCliente = telefoneCliente;
		this.numPedido = numPedido;
		
		System.out.println("Dados do pedido...");
		
	}

	
	public void Status(String statusPedido, int numPedido) {
		this.statusPedido = statusPedido;
		this.numPedido = numPedido;
		
		System.out.println("Status do pedido...");
	}
	
	public String ToString(String enderecoSaida, String enderecoChegada, 
			String nomeCliente, double telefoneCliente, String statusPedido) {
		return "Endereco de saida: " + this.enderecoSaida + "Endereco destino: " + this.enderecoChegada
				+ " Nome do Cliente : " + this.nomeCliente + " Telefone do cliente: " + this.telefoneCliente
				+ "Status do pedido: " + this.statusPedido + "Numero do pedido" + this.numPedido;
	}



}



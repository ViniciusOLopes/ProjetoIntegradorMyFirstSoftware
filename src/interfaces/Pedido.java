package interfaces;

public interface Pedido {
	
	public void Localizacao(String enderecoSaida, String enderecoChegada, String nomeCliente, double telefoneCliente, int numPedido);
	public void Status(String statusPedido, int numPedido);
	
	//Retirando os gets da interface:
	
	/*String getEnderecoSaida();
	String getEnderecoChegada();
	String getNomeCliente();
	double getTelefoneCliente();
	int  getNumPedido();
	String getStatusPedido();
	*/

}

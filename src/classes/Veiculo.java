package classes;

import interfaces.Automovel;

public class Veiculo implements Automovel {
	
	private String tipo;
	private String placa;
	private String renavam;
	private String chassi;
	private Entregador dono;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String tipo, String placa, String renavam, String chassi, Entregador dono) {
		this.setChassi(chassi);
		this.setPlaca(placa);
		this.setRenavam(renavam);
		this.setTipo(tipo);
		this.setDono(dono);
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getRenavam() {
		return renavam;
	}
	
	public String getChassi() {
		return chassi;
	}
	public Entregador getDono() {
		return this.dono;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void setDono(Entregador dono) {
		this.dono = dono;
	}
	
	public void CadastrarVeiculo(String tipo, String placa, String renavam, String chassi) {
		this.tipo = tipo;
		this.placa = placa;
		this.renavam = renavam;
		this.chassi = chassi;
		
		System.out.println("Veiculo Cadastrado...");
	}
	
	public void DeletarVeiculo(String tipo, String placa, String renavam, String chassi) {
		this.tipo = null;
		this.placa = null;
		this.chassi = null;
		this.renavam = null;
		
		System.out.println("Veiculo Deletado...");
		
		
	}
	
	public String ToString() {
		return "Tipo: " + this.tipo + "Placa: " + this.placa + "Renavam: "+ this.renavam + "Chassi: " + this.chassi;
	}	
}

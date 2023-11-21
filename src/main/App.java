package main;
import classes.Entregador;
import classes.DadoPedido;
import classes.Empresa;
import classes.Veiculo;
import interfaces.Pedido;
import interfaces.Usuario;
import interfaces.Automovel;



public class App {
	
	public static void main(String[] args) {
		
		Usuario joao = new Entregador();
		joao.Cadastrar("06/01/2000", "Joao", 987654321, 1563610956, 994524565, "Rua XYZ, 456", "88789");
		
		System.out.println("Nome do usuário: " + joao.getNome());
		System.out.println("Data de nascimento: " + joao.getDataNascimento());
		System.out.println("Endereco: " + joao.getEndereco());
		System.out.println("CPF: " + joao.getCpf());
		System.out.println("CNH: " + joao.getCnh());
		
		
		boolean loginOk= joao.Login("88789", 987654321);
		
		if (loginOk) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login!");
        }
		
		joao.DeletarConta();
		
		
		Usuario IFG = new Empresa();
		IFG.Cadastrar(null,"IFG",3333333,0,8979595,"Rua pi","99989");
		
		System.out.println("Nome da Empresa: " + IFG.getNome());
		System.out.println("Endereco: " + IFG.getEndereco());
		System.out.println("CNPJ: " + IFG.getCpf());
		System.out.println("Telefone: " + IFG.getTelefone());
		
		
		boolean loginSucesso= IFG.Login("99989", 987654321);
		
		if (loginSucesso) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login!");
        }
		
		IFG.DeletarConta();
		
		Automovel moto = new Veiculo();
		
		
		moto.CadastrarVeiculo("Moto", "jgq9998", "777777798898", "87755sad577sex");
		
		System.out.println("Tipo veiculo: " + moto.getTipo());
		System.out.println("Placa: " + moto.getPlaca());
		System.out.println("Renavam: " + moto.getRenavam());
		System.out.println("Chassi: " + moto.getChassi());
		
		
		moto.DeletarVeiculo(null, null, null, null);
		
		Pedido pedido1 = new DadoPedido();
		pedido1.Localizacao("Rua a", "Rua b" , "Euza", 99853545, 1);
		
		System.out.println("Endereco de saida: " + pedido1.getEnderecoSaida());
		System.out.println("Endereco chegada: " + pedido1.getEnderecoChegada());
		System.out.println("Nome do cliente:" + pedido1.getNomeCliente());
		System.out.println("Telefone do Cliente" + pedido1.getTelefoneCliente());
		System.out.println("Numero do pedido:" + pedido1.getNumPedido());
		
		pedido1.Status("A caminho",1);
		
		System.out.println("Status do pedido: " + pedido1.getStatusPedido());
		System.out.println("Numero do pedido:" + pedido1.getNumPedido());
		
		
		
	}

}

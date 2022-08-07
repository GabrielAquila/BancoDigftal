

public class Main {

	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		
		Conta cc = new ContaCorrente(gabriel);
		Conta poupanca = new ContaPoupanca(gabriel);

		cc.depositar(400);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

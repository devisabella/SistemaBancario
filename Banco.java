
public class Banco {
	    public synchronized void transferir(Conta origem, Conta destino, double valor) {
	        origem.sacar(valor);
	        destino.depositar(valor);
	        System.out.println("TRANSFERIDO R$ " + valor + " da conta de origem para a conta de destino.");
	    }
	}



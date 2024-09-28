public class Conta {
	    private double saldo;

	    public Conta(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    public synchronized void depositar(double valor) {
	        saldo += valor;
	        System.out.println("DEPOSITADO: R$ " + valor + " | Saldo atual: R$ " + saldo);
	    }

	    public synchronized void sacar(double valor) {
	        if (saldo >= valor) {
	            saldo -= valor;
	            System.out.println("SACADO: R$ " + valor + " | Saldo atual: R$ " + saldo);
	        } else {
	            System.out.println("SALDO INSUFICIENTE! Tentativa de sacar: R$ " + valor + " | Saldo atual: R$ " + saldo);
	        }
	    }

	    public synchronized double getSaldo() {
	        return saldo;
	    }
	}



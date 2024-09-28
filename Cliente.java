import java.util.Random;

	public class Cliente extends Thread {
	    private Conta conta;
	    private Banco banco;
	    private Loja loja1;
	    private Loja loja2;

	    public Cliente(Banco banco, Loja loja1, Loja loja2) {
	        this.conta = new Conta(2000); 
	        this.banco = banco;
	        this.loja1 = loja1;
	        this.loja2 = loja2;
	    }

	    private void realizarCompra(Loja loja) {
	        Random random = new Random();
	        double valorCompra = 200 + (300 * random.nextDouble()); 
	        banco.transferir(conta, loja.getConta(), valorCompra);
	        System.out.println("CLIENTE REALIZOU UMA COMPRA NO VALOR DE: R$ " + valorCompra);
	    }

	    @Override
	    public void run() {
	        realizarCompra(loja1);
	        realizarCompra(loja1);
	        realizarCompra(loja2);
	        realizarCompra(loja2);
	    }
	}



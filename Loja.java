
public class Loja {
	    private Conta conta;

	    public Loja() {
	        this.conta = new Conta(0); 
	    }

	    public Conta getConta() {
	        return conta;
	    }

	    public void pagarFuncionario(Banco banco, Funcionario funcionario) {
	        if (conta.getSaldo() >= 1400) {
	            banco.transferir(conta, funcionario.getContaSalario(), 1400);
	            funcionario.investir();
	        } else {
	            System.out.println("SALDO INSUFICIENTE PARA PAGAMENTO.");
	        }
	    }
	}



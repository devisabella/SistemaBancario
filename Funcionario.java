
public class Funcionario {
	    private Conta contaSalario;
	    private Conta contaInvestimento;

	    public Funcionario() {
	        this.contaSalario = new Conta(0); 
	        this.contaInvestimento = new Conta(0); 
	    }

	    public Conta getContaSalario() {
	        return contaSalario;
	    }

	    public void investir() {
	        double valorInvestir = contaSalario.getSaldo() * 0.2; 
	        contaSalario.sacar(valorInvestir);
	        contaInvestimento.depositar(valorInvestir);
	        System.out.println("FUNCIONARIO INVESTIU R$ " + valorInvestir);
	    }
	}


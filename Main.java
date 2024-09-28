
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Banco banco = new Banco();

        Loja loja1 = new Loja();
        Loja loja2 = new Loja();

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
        Funcionario func4 = new Funcionario();

        Cliente[] clientes = new Cliente[10];
        for (int i = 0; i < 10; i++) {
            clientes[i] = new Cliente(banco, loja1, loja2);
            clientes[i].start();
        }

        for (Cliente cliente : clientes) {
            cliente.join();
        }

        loja1.pagarFuncionario(banco, func1);
        loja1.pagarFuncionario(banco, func2);
        loja2.pagarFuncionario(banco, func3);
        loja2.pagarFuncionario(banco, func4);

        System.out.println("SALDO FINAL DA LOJA 1: R$ " + loja1.getConta().getSaldo());
        System.out.println("SALDO FINAL DA LOJA 2: R$ " + loja2.getConta().getSaldo());
    }
}

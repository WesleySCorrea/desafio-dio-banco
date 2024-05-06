import entity.Cliente;
import entity.Conta;
import entity.ContaCorrente;
import entity.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Fulano");
        Cliente cliente2 = new Cliente("Beltrano");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaPoupanca.depositar(5000);
        contaPoupanca.sacar(1000);
        contaPoupanca.transferir(contaCorrente, 2000);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.sacar(3000);
        contaCorrente.imprimirExtrato();
    }
}

package entity;

import entity.interfaces.IConta;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1001;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente\n");
        }
    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDadosDaConta() {
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.conta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("Titular da conta: " + this.cliente.getNome());
    }
}

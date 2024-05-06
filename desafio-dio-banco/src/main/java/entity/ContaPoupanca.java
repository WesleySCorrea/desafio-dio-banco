package entity;

import lombok.Getter;

@Getter
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----- Imprimir extrato da conta poupança -----\n");
        imprimirDadosDaConta();
        System.out.println("----------------------------------------------\n");
    }

}

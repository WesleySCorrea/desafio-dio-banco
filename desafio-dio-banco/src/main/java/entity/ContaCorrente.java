package entity;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----- Imprimir extrato da conta corrente -----\n");
        imprimirDadosDaConta();
        System.out.println("----------------------------------------------\n");
    }
}

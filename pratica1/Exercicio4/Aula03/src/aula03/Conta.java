package aula03;

public class Conta {

    int numero;
    Cliente titular;
    double saldo;

    void visualizarSaldo() {

        System.out.println("Saldo=" + this.saldo);

    }

    void depositar(double valor) {

        if (valor > 0) {

            this.saldo = this.saldo + valor;

        }

    }

    boolean sacar(double value) {

        if (value <= this.saldo) {
            this.saldo = this.saldo - value;
            return true;
        } else {
            return false;
        }

    }

    void transferirPara(double valor, Conta n) {

        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            n.saldo = n.saldo + valor;
            System.out.println("Transferido!");
        } else {
            System.out.println("Você não tem dinheiro!");
        }

    }
    
    void visualizarConta() {

        this.titular.visualizarCliente();
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo= " + this.saldo);

    }
}

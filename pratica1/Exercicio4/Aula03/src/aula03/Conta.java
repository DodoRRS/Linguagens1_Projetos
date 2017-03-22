package aula03;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;
    private static int totalDeContas;

    public void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    public boolean sacar(double value) {
        if (this.saldo < value) {
            return false;
        } else {
            this.saldo = this.saldo - value;
            return true;
        }
    }

    public void transferirPara(double valor, Conta c) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            c.saldo = c.saldo + valor;
            System.out.println("Transferencia realizada com sucesso");
        } else {
            System.out.println("Nao foi possivel");
        }
    }

    public Conta(int numero, double saldo, String nome, String sobrenome, String cpf) {

        this.numero = numero;
        this.saldo = saldo;
        this.titular = new Cliente();
        this.titular.cliente(nome, sobrenome, cpf);
        Conta.totalDeContas = Conta.totalDeContas + 1;

    }
    
    public double getSaldo(){
    
        return this.saldo;
    
    }
    
    public void visualizarCliente() {
        System.out.println("Cliente: " + this.titular.getNome() + " " + this.titular.getSobrenome());
        System.out.println("CPF: " + this.titular.getCpf());
    }
    
    public double getTotalDeContas(){
    
        return Conta.totalDeContas;
    
    }
    
    public void alterarCPF(String cpf) {
       this.titular.mudarCPF(cpf);
        
    }
    
}

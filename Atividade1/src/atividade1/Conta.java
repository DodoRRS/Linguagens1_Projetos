/* Douglas Rezende Rodrigues da Silveira    RA: 13.02016-0
   Fabio Kawasaki   RA: 13.02838-3
 */
package atividade1;

public class Conta {

    private int agencia;
    private Dinheiro saldo;
    private String cc;
    private Dinheiro limite;
    private Cliente titular;
    private static int totalDeContas;

    public void exibirSaldo() {
        System.out.println("Saldo = " + this.saldo.getValor());
    }

    public void depositar(double valor) {
        double v = this.saldo.getValor();
        if (valor > 0) {
            v = v + valor;
            this.saldo.setValor(v);
        }
    }

    public boolean sacar(double value) {
        double v = this.saldo.getValor();
        if (v < value) {
            return false;
        } else {
            v = v - value;
            this.saldo.setValor(v);
            return true;
        }
    }

    public void transferirPara(double valor, Conta c) {
        double v = this.saldo.getValor();
        double a = c.saldo.getValor();
        if (v >= valor) {
            v = v - valor;
            a = a + valor;
            c.saldo.setValor(a);
            System.out.println("Transferencia realizada com sucesso");
        } else {
            System.out.println("Nao foi possivel");
        }
    }

    public Conta(String cc, double limite, int agencia, double saldo, String nome, String sobrenome, String cpf) {
        this.cc = cc;
        this.agencia = agencia;
        double s = saldo;
        this.saldo.setValor(s);
        double l = limite;
        this.limite.setValor(l);
        this.titular = new Cliente();
        this.titular.cliente(nome, sobrenome, cpf);
        Conta.totalDeContas = Conta.totalDeContas + 1;

    }

    public void exibirTitular() {
        System.out.println("Titular: " + this.titular.getNome() + " " + this.titular.getSobrenome());
    }

    public void exibirTodasInformacoesDaConta() {
        System.out.println("Titular: " + this.titular.getNome() + " " + this.titular.getSobrenome());
        System.out.println("CPF: " + this.titular.getCpf());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta corrente: " + this.cc);
        System.out.println("Saldo: " + this.saldo.getValor());
        System.out.println("Limite: " + this.limite.getValor());
    }

    public double getTotalDeContas() {

        return Conta.totalDeContas;

    }

    public void alterarCPF(String cpf) {
        this.titular.mudarCPF(cpf);

    }

    public void alterarNome(String nome) {
        this.titular.mudarNome(nome);

    }

    public void alterarSobrenome(String sobrenome) {
        this.titular.mudarSobrenome(sobrenome);

    }

    public void alterarMoedaCorrenteDaConta(String m) {
        this.saldo.setMoeda(m);
    }
}

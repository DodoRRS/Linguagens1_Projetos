package aula03;

public class Aula03 {

    public static void main(String[] args) {
        Conta c1 = new Conta(12345, 1000, "Fabio", "Kawasaki", "111.111.111-11");
        c1.visualizarCliente();
        c1.visualizarSaldo();
        c1.alterarCPF("222.222.222-22");
        c1.visualizarCliente();

    }

}

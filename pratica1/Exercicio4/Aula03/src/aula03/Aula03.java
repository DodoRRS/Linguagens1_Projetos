package aula03;

public class Aula03 {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.titular = new Cliente();
        c1.titular.cpf = "213.047.838-57";
        c1.titular.nome = "Seh";
        c1.titular.sobrenome = "Loiro";

        Conta c2 = new Conta();
        c2.titular = new Cliente();
        c2.titular.cpf = "222.222.222-22";
        c2.titular.nome = "Fabio";
        c2.titular.sobrenome = "Fukuyoshi";

        c1.titular.visualizarCliente();
        c2.titular.visualizarCliente();
        c1.saldo = 1000;
        //c1.visualizarSaldo();
        //c1.sacar(200);
        //c1.visualizarSaldo();

        c2.saldo = 1000;
        //c2.visualizarSaldo();
        //c2.transferirPara(500, c1);
        //c2.visualizarSaldo();
        //c1.visualizarSaldo();
    }

}

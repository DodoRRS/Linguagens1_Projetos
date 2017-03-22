/* Douglas Rezende Rodrigues da Silveira    RA: 13.02016-0
   Fabio Kawasaki   RA: 13.02838-3
 */
package atividade1;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;

    public void visualizarCliente() {
        System.out.println("Cliente: " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }

    public void cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {

        return this.nome;

    }

    public String getSobrenome() {

        return this.sobrenome;

    }

    public String getCpf() {

        return this.cpf;

    }

    public void mudarCPF(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possivel alterar o CPF.");
        }
    }

    private boolean validarCPF(String cpf) {
        return true;
    }

    public void mudarNome(String nome) {
        if (validarNome(nome)) {
            this.nome = nome;
        } else {
            System.out.println("Não foi possivel alterar o nome.");
        }
    }

    private boolean validarNome(String nome) {
        return true;
    }

    public void mudarSobrenome(String sobrenome) {
        if (validarNome(sobrenome)) {
            this.sobrenome = sobrenome;
        } else {
            System.out.println("Não foi possivel alterar o sobrenome.");
        }
    }

    private boolean validarSobreome(String sobrenome) {
        return true;
    }

    public String setNome(String nm) {

        return this.nome = nm;

    }

    public String setSobrenome(String sb) {

        return this.sobrenome = sb;

    }

    public String setCpf(String cp) {

        return this.cpf = cp;

    }

}

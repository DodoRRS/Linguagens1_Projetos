package aula03;

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
       if (validarCPF(cpf)){
           this.cpf = cpf;  
       } else {
           System.out.println("Não foi possivel alterar o CPF.");
       }
   }    private boolean validarCPF(String cpf) {
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

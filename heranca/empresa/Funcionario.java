package heranca.empresa;

public class Funcionario {
    
    protected String nome;
    protected Integer cpf;
    protected Integer telefone;

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public Integer getCpf(){
        return this.cpf;
    }

    public void setCpf(){
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelfone(Integer telfone) {
        this.telefone = telefone;
    }

    public Double getSalario(){
        return 1000.00;
    }

    public Double getBonificacao(){
        return getSalario() * 0.05;
    }
}
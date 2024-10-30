public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(int id, String nome, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf	= this.cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        endereco = this.endereco;
    }

    @Override
    public String toString() {
        return  "{ID: " + id + ", Nome: " + nome + " , CPF: " + cpf + " , Endereço: " + endereco + "}";
    }
}


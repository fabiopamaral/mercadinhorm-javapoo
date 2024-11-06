public class Produto {
    private int id;
    private String nome;
    private String marca;
    private String setor;
    private double precoCusto;
    private double precoVenda;
    private int numeroVendas; 

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }


    public Produto(int id, String nome, String marca, String setor, double precoCusto, double precoVenda, int numeroVendas) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.setor = setor;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.numeroVendas = numeroVendas;
    }

    @Override
    public String toString() {
        return "{ID: " + id + ", Nome: " + nome + ", Marca: " + marca + ", Setor: " + setor + 
               ", Preço de Custo: " + precoCusto + ", Preço de Venda: " + precoVenda + ", Número de Vendas: " + numeroVendas + "}";
    }
}


public class Produto {
    Scanner calc = New Scanner (System.in)
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private double precoCusto;
    private double precoVenda;

    public Produto(String nome, double preco, int quantidade, double custo, double venda) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
        this.precoCusto = custo;
        this.precoVenda = venda;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidadeEstoque;  
      }
    public double getCusto() {
        return this.precoCusto;
    }
    public double getVenda() {
        return this.precoVenda;
    }
    float lucro; 

    Calclucro(){ 

        Lucro = precoValor - precoCusto; 

        System.out.println ("Seu lucro é:" + lucro); 

    }

}

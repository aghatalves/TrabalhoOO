package supermercado;

public class ProdutoMercado extends Produto
{
    private String codigoProduto;
    private String marcaProduto;


    public ProdutoMercado(float precoProduto, String nome, String codigoProduto, String marcaProduto)
    {
        preco = precoProduto;
        nomeProduto = nome;
        this.codigoProduto = codigoProduto;
        this.marcaProduto = marcaProduto;
    }

    public String getCodigoProduto() { return codigoProduto; }

    public void setCodigoProduto(String codigoProduto) { this.codigoProduto = codigoProduto; }

    public String getMarcaProduto() { return marcaProduto; }

    public void setMarcaProduto(String marcaProduto) { this.marcaProduto = marcaProduto; }

    public float verificarPrecoTotal() { return preco; }
}

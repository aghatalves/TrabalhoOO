package supermercado;

public abstract class Produto
{
    protected float preco;
    protected String nomeProduto;

    public float getPreco()
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public String getNomeProduto()
    {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public abstract float verificarPrecoTotal();
}

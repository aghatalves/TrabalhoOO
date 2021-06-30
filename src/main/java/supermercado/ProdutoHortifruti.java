package supermercado;

public class ProdutoHortifruti extends Produto
{
    private float pesoGramas;

    public ProdutoHortifruti(float pesoEmGramas, float pesoPorKilo)
    {
        this.pesoGramas = pesoEmGramas;
        preco = pesoPorKilo;
    }

    public float getPesoGramas() { return pesoGramas; }

    public void setPesoGramas(float pesoGramas) { this.pesoGramas = pesoGramas; }

    public float converteGramaQuilo(float pesoGramas) { return pesoGramas / 1000; }

    public float verificarPrecoTotal()
    {
        float total = (converteGramaQuilo(pesoGramas) * preco) * 100;
        return total / 100;
    }
}

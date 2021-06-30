package supermercado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoHortifrutiTest
{
    @Test
    void deveRetornarPrecoDoProduto()
    {
        ProdutoHortifruti produto = new ProdutoHortifruti(1000.0f, 2.0f);

        assertEquals(2.0f, produto.getPreco());
    }

    @Test
    void deveRetornarNomeDoProduto()
    {
        ProdutoHortifruti produto = new ProdutoHortifruti(1000.0f, 2.0f);
        produto.setNomeProduto("Tomate");

        assertEquals("Tomate", produto.getNomeProduto());
    }

    @Test
    void deveRetornarPesoEmGramasDoProduto()
    {
        ProdutoHortifruti produto = new ProdutoHortifruti(1000.0f, 2.0f);

        assertEquals(1000.0f, produto.getPesoGramas());
    }

    @Test
    void deveConverterGramasParaQuilo()
    {
        ProdutoHortifruti produto = new ProdutoHortifruti(1000.0f, 2.0f);

        assertEquals(1.0f, produto.converteGramaQuilo(produto.getPesoGramas()));
    }

    @Test
    void deveCalcularPrecoFinal()
    {
        ProdutoHortifruti produto = new ProdutoHortifruti(1000.0f, 2.0f);

        assertEquals(2.0f, produto.verificarPrecoTotal());
    }
}
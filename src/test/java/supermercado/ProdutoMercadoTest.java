package supermercado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoMercadoTest
{
    @Test
    void deveRetornarPrecoDoProduto()
    {
        ProdutoMercado produto = new ProdutoMercado(
                15.0f,
                "Waffle",
                "5484",
                "Piraque");

        assertEquals(15.0f, produto.getPreco());
    }

    @Test
    void deveRetornarNomeDoProduto()
    {
        ProdutoMercado produto = new ProdutoMercado(
                15.0f,
                "Waffle",
                "5484",
                "Piraque");

        assertEquals("Waffle", produto.getNomeProduto());
    }

    @Test
    void deveRetornarCodigoDoProduto()
    {
        ProdutoMercado produto = new ProdutoMercado(
                15.0f,
                "Waffle",
                "5484",
                "Piraque");

        assertEquals("5484", produto.getCodigoProduto());
    }

    @Test
    void deveRetornarMarcaDoProduto()
    {
        ProdutoMercado produto = new ProdutoMercado(
                15.0f,
                "Waffle",
                "5484",
                "Piraque");

        assertEquals("Piraque", produto.getMarcaProduto());
    }

    @Test
    void deveCalcularPrecoFinal()
    {
        ProdutoMercado produto = new ProdutoMercado(
                15.0f,
                "Waffle",
                "5484",
                "Piraque");

        assertEquals(15.0f, produto.verificarPrecoTotal());
    }

}
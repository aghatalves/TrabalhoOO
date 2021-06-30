package supermercado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoAcougueTest
{
    @Test
    void deveRetornarPrecoDoProduto()
    {
        ProdutoAcougue produto = new ProdutoAcougue(1000.0f, 2.0f);

        assertEquals(2.0f, produto.getPreco());
    }

    @Test
    void deveRetornarNomeDoProduto()
    {
        ProdutoAcougue produto = new ProdutoAcougue(1000.0f, 2.0f);
        produto.setNomeProduto("Carne Bovina");

        assertEquals("Carne Bovina", produto.getNomeProduto());
    }

    @Test
    void deveRetornarPesoEmGramasDoProduto()
    {
        ProdutoAcougue produto = new ProdutoAcougue(1000.0f, 2.0f);

        assertEquals(1000.0f, produto.getPesoGramas());
    }

    @Test
    void deveConverterGramasParaQuilo()
    {
        ProdutoAcougue produto = new ProdutoAcougue(1000.0f, 2.0f);

        assertEquals(1.0f, produto.converteGramaQuilo(produto.getPesoGramas()));
    }

    @Test
    void deveCalcularPrecoFinal()
    {
        ProdutoAcougue produto = new ProdutoAcougue(1000.0f, 20.0f);

        assertEquals(20.0f, produto.verificarPrecoTotal());
    }
}
package supermercado;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest
{
    @Test
    void deveCalcularNotaFiscalUnicoProduto ()
    {
        ProdutoAcougue produto1 = new ProdutoAcougue(1000.0f, 10.0f);

        List<Produto> lista = new ArrayList<Produto>();
        lista.add(produto1);

        assertEquals(10.00f, Carrinho.totalAPagar(lista));
    }

    @Test
    void deveCalcularNotaFiscalDoisProduto ()
    {
        ProdutoAcougue produto1 = new ProdutoAcougue(1000.0f, 10.0f);
        ProdutoHortifruti produto2 = new ProdutoHortifruti(1000.0f, 5.0f);
        List<Produto> lista = new ArrayList<Produto>();
        lista.add(produto1);
        lista.add(produto2);

        assertEquals(15.00f, Carrinho.totalAPagar(lista));
    }

    @Test
    void deveCalcularNotaFiscalTresProdutos ()
    {
        ProdutoMercado produto1 = new ProdutoMercado(
                10.0f,
                "Leite",
                "245",
                "Macuco");

        ProdutoAcougue produto2 = new ProdutoAcougue(2000.0f, 10.0f);
        ProdutoHortifruti produto3 = new ProdutoHortifruti(1000.0f, 5.0f);

        List<Produto> lista = new ArrayList<Produto>();
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);

        assertEquals(35.00f, Carrinho.totalAPagar(lista));
    }

    @Test
    void deveCalcularNotaFiscalVariosProdutos ()
    {
        ProdutoAcougue produto1 = new ProdutoAcougue(2000.0f, 10.0f);
        ProdutoHortifruti produto2 = new ProdutoHortifruti(1000.0f, 5.0f);
        ProdutoMercado produto3 = new ProdutoMercado(
                10.0f,
                "Bolo",
                "370",
                "Bauduco");
        ProdutoAcougue produto4 = new ProdutoAcougue(300.0f, 19.90f);
        ProdutoAcougue produto5 = new ProdutoAcougue(2000.0f, 20.0f);
        ProdutoHortifruti produto6 = new ProdutoHortifruti(500.0f, 10.0f);
        ProdutoHortifruti produto7 = new ProdutoHortifruti(1300.0f, 32.5f);

        List<Produto> lista = new ArrayList<Produto>();
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        lista.add(produto4);
        lista.add(produto5);
        lista.add(produto6);
        lista.add(produto7);

        assertEquals(128.22f, Carrinho.totalAPagar(lista));
    }
}
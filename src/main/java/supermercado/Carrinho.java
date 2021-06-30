package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho
{
    public static float totalAPagar(List<Produto> produtos)
    {
    float total = 0.0f;
    for(Produto produto : produtos)
    {
        total += produto.verificarPrecoTotal();
    }
    return total;
    }
}

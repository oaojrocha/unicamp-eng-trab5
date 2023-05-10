package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoBeanTest {

    final Double VALOR_PRODUTO_MENOR = 1.0;
    final Double VALOR_PRODUTO_MAIOR = 10.0;

    @Test
    public void testCompareTo() {
        Assertions.assertEquals(1, buildProdutoBean(VALOR_PRODUTO_MAIOR)
                .compareTo(buildProdutoBean(VALOR_PRODUTO_MENOR)));

        Assertions.assertEquals(-1, buildProdutoBean(VALOR_PRODUTO_MENOR)
                .compareTo(buildProdutoBean(VALOR_PRODUTO_MAIOR)));

        Assertions.assertEquals(0, buildProdutoBean(VALOR_PRODUTO_MAIOR)
                .compareTo(buildProdutoBean(VALOR_PRODUTO_MAIOR)));
    }

    private ProdutoBean buildProdutoBean(final Double valorProduto) {
        return new ProdutoBean("000123", "Prod 123", "Desc. Prod 123", valorProduto, "NOVO");
    }
}

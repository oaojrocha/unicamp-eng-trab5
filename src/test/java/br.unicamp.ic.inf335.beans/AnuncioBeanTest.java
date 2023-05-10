package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class AnuncioBeanTest {

    final Double VALOR_PRODUTO = 10.0;
    final Double DESCONTO = 10.0;
    final Double VALOR_COM_DESCONTO = 9.0;

    @Test
    public void testGetValor_SemDesconto() {
        Assertions.assertEquals(VALOR_PRODUTO, buildAnuncioBean(VALOR_PRODUTO,0.0).getValor());
    }

    @Test
    public void testGetValor_ComDesconto() {
        Assertions.assertEquals(VALOR_COM_DESCONTO, buildAnuncioBean(VALOR_PRODUTO, DESCONTO).getValor());
    }

    @Test
    public void testGetValor_ValorProdutoZerado_ComDesconto() {
        Assertions.assertEquals(0.0, buildAnuncioBean(0.0, DESCONTO).getValor());
    }

    private AnuncioBean buildAnuncioBean(final Double valorProduto, final Double desconto) {
        try {
            final URL url = new URL("https://static.wikia.nocookie.net/p__/images/0/04/Jane_Doe.png/revision/latest?cb=20200623093123&path-prefix=protagonist");

            final ArrayList<URL> fotosUrl = new ArrayList<URL>();
            fotosUrl.add(url);
            fotosUrl.add(url);

            return new AnuncioBean(buildProdutoBean(valorProduto), fotosUrl, desconto);
        } catch (MalformedURLException ex) {
            return new AnuncioBean(buildProdutoBean(valorProduto), new ArrayList<URL>(), desconto);
        }
    }

    private ProdutoBean buildProdutoBean(final Double valorProduto) {
        return new ProdutoBean("000123", "Prod 123", "Desc. Prod 123", valorProduto, "NOVO");
    }

}

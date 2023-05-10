package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class AnuncianteBeanTest {

    final Double VALOR_PRODUTO = 10.0;

    @Test
    public void testAddAnuncio() {
        final AnuncianteBean a1 = buildAnuncianteBean();
        a1.addAnuncio(buildAnuncioBean());

        Assertions.assertEquals(6, a1.getAnuncios().size());
    }

    @Test
    public void testRemoveAnuncio() {
        final AnuncianteBean a1 = buildAnuncianteBean();
        a1.removeAnuncio(0);

        Assertions.assertEquals(4, a1.getAnuncios().size());
    }

    @Test
    public void testValorMedioAnuncios() {
        final AnuncianteBean a = buildAnuncianteBean();
        Assertions.assertEquals(VALOR_PRODUTO, a.valorMedioAnuncios());
    }


    private AnuncianteBean buildAnuncianteBean() {
        return new AnuncianteBean("mock", "123", buildAnuncioBeanList());
    }

    private AnuncioBean buildAnuncioBean() {
        try {
            final URL url = new URL("https://static.wikia.nocookie.net/p__/images/0/04/Jane_Doe.png/revision/latest?cb=20200623093123&path-prefix=protagonist");

            final ArrayList<URL> fotosUrl = new ArrayList<URL>();
            fotosUrl.add(url);
            fotosUrl.add(url);

            return new AnuncioBean(buildProdutoBean(), fotosUrl, 0.0);
        } catch (MalformedURLException ex) {
            return new AnuncioBean(buildProdutoBean(), new ArrayList<URL>(), 0.0);
        }
    }

    private ArrayList<AnuncioBean> buildAnuncioBeanList() {
        final ArrayList<AnuncioBean> anuncioBeans = new ArrayList<AnuncioBean>();
        anuncioBeans.add(buildAnuncioBean());
        anuncioBeans.add(buildAnuncioBean());
        anuncioBeans.add(buildAnuncioBean());
        anuncioBeans.add(buildAnuncioBean());
        anuncioBeans.add(buildAnuncioBean());

        return anuncioBeans;
    }

    private ProdutoBean buildProdutoBean() {
        return new ProdutoBean("000123", "Prod 123", "Desc. Prod 123", VALOR_PRODUTO, "NOVO");
    }

}

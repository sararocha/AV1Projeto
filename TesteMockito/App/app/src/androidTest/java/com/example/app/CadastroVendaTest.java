package com.example.app;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CadastroVendaTest {

    private CadastroVenda CadastroVenda;

    @Before
    public void init() {
        CadastroVenda = new CadastroVenda();
    }

    @Test
    public void deveriaRealizarCalculo() {

        int n1 = 5;
        int n2 = 5;
        assertEquals(30, CadastroVenda.calcularValorFinal(n1, n2));

    }
}

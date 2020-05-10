package com.example.app;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadastroPedidoTest {

    private CadastroPedido CadastroPedido;

    @Before
    public void init() {
        CadastroPedido = new CadastroPedido();
    }

    @Test
    public void deveCalcularPedido() {
        int valor = 5;
        int peso = 1;
        assertEquals(5, CadastroPedido.calcularPedido(valor, peso));

    }
}

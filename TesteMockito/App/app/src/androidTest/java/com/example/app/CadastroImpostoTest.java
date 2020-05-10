package com.example.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadastroImpostoTest {

    private CadastroImposto CadastroImposto;


    @Before
    public void init() {
        CadastroImposto = new CadastroImposto();
    }

    @Test
    public void deveCalcularImposto() {
        int estadoOrigem = 3;
        int estadoDestino = 2;
       assertEquals(6,CadastroImposto.calcularImposto(estadoOrigem, estadoDestino));


    }
}

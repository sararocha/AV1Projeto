/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimpostoteste;

import preco.Preco;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Alicia
 */
public class CalcularImpostoTeste {
    
    private Preco calcular;

    @Test
    public void deveriaCalcular() {
        
        double n1 = 5;
        double n2 = 2.5;
        
        assertEquals(5, calcular.calcularPreco(n1, n2));
        calcular.calcularPreco(n1, n2);
    }
  }


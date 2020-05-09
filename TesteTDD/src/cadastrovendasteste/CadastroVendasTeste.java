/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrovendasteste;

import org.junit.Assert;
import org.junit.Test;
import vendas.Vendas;

/**
 *
 * @author Alicia
 */
public class CadastroVendasTeste {

    private Vendas cadastro;
    
    private String nome;
    private String cpf;
    private String peso;
    private String endereco;
    private String preco;
    private String imposto;
    
    @Test
    public void deveriaCadastrar() { 
        
    cadastro.cadastroVendas (nome, cpf, peso, endereco, preco, imposto);
        
}

}

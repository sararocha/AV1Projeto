/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropedidoteste;

import org.junit.Test;
import pedido.Pedido;

public class CadastroPedidoTeste {

    private Pedido cadastro;

    private String nome;
    private String cpf;
    private String peso;
    private String endereco;
    private String contato;

    @Test
    public void deveriaCadastrar() {

        cadastro.cadastroPedido(nome, cpf, peso, endereco, contato);
    }
}

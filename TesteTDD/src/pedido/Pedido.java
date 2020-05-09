/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

/**
 *
 * @author Alicia
 */
public class Pedido {
    
    private String nome;
    private String cpf;
    private String peso;
    private String endereco;
    private String contato;
    
    public void cadastroPedido(String nome, String cpf, String peso, String endereco, String contato){
        
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getPeso() {
        return peso;
    }

   
    public void setPeso(String peso) {
        this.peso = peso;
    }

    
    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getContato() {
        return contato;
    }

    
    public void setContato(String contato) {
        this.contato = contato;
    }
    
}

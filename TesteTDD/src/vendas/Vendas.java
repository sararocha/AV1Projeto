/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

/**
 *
 * @author Alicia
 */
public class Vendas {

    private String nome;
    private String cpf;
    private String peso;
    private String endereco;
    private String preco;
    private String imposto;

    public void cadastroVendas(String nome, String cpf, String peso, String endereco, String preco, String imposto) {

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

    
    public String getPreco() {
        return preco;
    }

    
    public void setPreco(String preco) {
        this.preco = preco;
    }

    
    public String getImposto() {
        return imposto;
    }

    public void setImposto(String imposto) {
        this.imposto = imposto;
    }

}

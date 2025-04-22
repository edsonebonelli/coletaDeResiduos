package br.com.fiap.coletaDeResiduos.domain;

import br.com.fiap.coletaDeResiduos.dto.DadosCadastroEndereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Embeddable
@Getter
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {
    }
    public Endereco(DadosCadastroEndereco dados) {
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.cep = dados.cep();
    }
    public void atualizarEndereco(DadosCadastroEndereco dados) {
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.estado() != null){
            this.estado = dados.estado();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
    }
}

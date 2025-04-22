package br.com.fiap.coletaDeResiduos.domain;

import br.com.fiap.coletaDeResiduos.dto.DadosAtualizarCliente;
import br.com.fiap.coletaDeResiduos.dto.DadosCadastroCliente;
import br.com.fiap.coletaDeResiduos.enums.StatusCliente;
import br.com.fiap.coletaDeResiduos.enums.TipoCliente;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteid;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Date dataCadastro;

    @Enumerated(EnumType.STRING)
    private StatusCliente statusCliente;

    @Enumerated(EnumType.STRING)
    private TipoCliente tipoCliente;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Cliente(){

    }
    public Cliente(DadosCadastroCliente dados) {
        this.clienteid = dados.clienteid();
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.dataCadastro = dados.dataCadastro();
        this.statusCliente = dados.statusCliente();
        this.tipoCliente = dados.tipoCliente();
        this.endereco = new Endereco(dados.endereco());
        this.ativo = true;
    }
    public Long getClienteid() {
        return clienteid;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public StatusCliente getStatusCliente() {
        return statusCliente;
    }
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void atualizarInformacoes(DadosAtualizarCliente dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if (dados.dadosCadastroEndereco() != null){
            this.endereco.atualizarEndereco(dados.dadosCadastroEndereco());
        }
    }
    public void excluir() {
        this.ativo = false;
    }
}








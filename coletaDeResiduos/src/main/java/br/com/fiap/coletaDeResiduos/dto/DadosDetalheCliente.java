package br.com.fiap.coletaDeResiduos.dto;

import br.com.fiap.coletaDeResiduos.enums.StatusCliente;
import br.com.fiap.coletaDeResiduos.enums.TipoCliente;
import br.com.fiap.coletaDeResiduos.domain.Cliente;
import br.com.fiap.coletaDeResiduos.domain.Endereco;

import java.util.Date;

public record DadosDetalheCliente(
        Long id,
        String nome,
        String email,
        String telefone,
        String cpf,
        Date dataCadastro,
        StatusCliente statusCliente,
        TipoCliente tipoCliente,
        Endereco endereco
) {
    public DadosDetalheCliente(Cliente cliente){
        this(
                cliente.getClienteid(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone(),
                cliente.getCpf(),
                cliente.getDataCadastro(),
                cliente.getStatusCliente(),
                cliente.getTipoCliente(),
                cliente.getEndereco()
        );
    }
}

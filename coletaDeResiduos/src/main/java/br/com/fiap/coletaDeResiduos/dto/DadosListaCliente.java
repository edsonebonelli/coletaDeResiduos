package br.com.fiap.coletaDeResiduos.dto;

import br.com.fiap.coletaDeResiduos.enums.StatusCliente;
import br.com.fiap.coletaDeResiduos.domain.Cliente;

import java.util.Date;

public record DadosListaCliente(
        Long id,
        String nome,
        String email,
        Date dataCadastro,
        StatusCliente statusCliente
) {
    public DadosListaCliente(Cliente cliente){
        this(cliente.getClienteid(), cliente.getNome(), cliente.getEmail(), cliente.getDataCadastro(), cliente.getStatusCliente());
    }
}

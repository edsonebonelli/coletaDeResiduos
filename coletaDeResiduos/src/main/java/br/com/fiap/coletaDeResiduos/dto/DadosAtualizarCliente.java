package br.com.fiap.coletaDeResiduos.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarCliente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosCadastroEndereco dadosCadastroEndereco) {
}

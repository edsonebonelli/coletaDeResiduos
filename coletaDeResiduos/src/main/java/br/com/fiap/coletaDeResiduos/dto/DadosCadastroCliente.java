package br.com.fiap.coletaDeResiduos.dto;

import br.com.fiap.coletaDeResiduos.enums.StatusCliente;
import br.com.fiap.coletaDeResiduos.enums.TipoCliente;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Date;

public record DadosCadastroCliente(
        Long clienteid,
        @NotNull
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotNull
        String telefone,
        @NotNull
        @Pattern(regexp = "\\d{11}")
        String cpf,
        @NotNull
        Date dataCadastro,
        @NotNull
        StatusCliente statusCliente,
        @NotNull
        TipoCliente tipoCliente,
        @NotNull
        @Valid
        DadosCadastroEndereco endereco
) {
}

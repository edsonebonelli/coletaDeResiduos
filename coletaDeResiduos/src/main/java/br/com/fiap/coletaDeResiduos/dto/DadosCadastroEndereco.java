package br.com.fiap.coletaDeResiduos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        @NotBlank
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String estado,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep
) {
}

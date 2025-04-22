package br.com.fiap.coletaDeResiduos.dto;

import br.com.fiap.coletaDeResiduos.enums.FrequenciaRota;
import br.com.fiap.coletaDeResiduos.enums.TipoRota;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public record DadosCadastroRotas(
        Long rotaid,
        @NotNull
        @NotBlank
        String nomeDaRota,
        @NotNull
        LocalDate dataDaColeta,
        @NotNull
        LocalTime horaDeInicio,
        @NotNull
        LocalTime horaDeTermino,
        @NotNull
        String distanciaRota,
        @NotNull
        TipoRota tipoRota,
        @NotNull
        FrequenciaRota frequenciaRota
) {
}

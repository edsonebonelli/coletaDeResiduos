package br.com.fiap.coletaDeResiduos.dto;

import br.com.fiap.coletaDeResiduos.enums.FrequenciaRota;
import br.com.fiap.coletaDeResiduos.enums.TipoRota;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizarRotas(
        @NotNull
        Long id,
        String nomeDaRota,
        LocalDate dataDaColeta,
        TipoRota tipoRota,
        FrequenciaRota frequenciaRota
) {
}

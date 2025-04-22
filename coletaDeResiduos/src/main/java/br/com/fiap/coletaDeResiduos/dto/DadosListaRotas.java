package br.com.fiap.coletaDeResiduos.dto;

import br.com.fiap.coletaDeResiduos.enums.FrequenciaRota;
import br.com.fiap.coletaDeResiduos.enums.TipoRota;
import br.com.fiap.coletaDeResiduos.domain.Rotas;

import java.time.LocalDate;

public record DadosListaRotas(
        Long id,
        String nomeDaRota,
        LocalDate dataDaColeta,
        String distanciaRota,
        TipoRota tipoRota,
        FrequenciaRota frequenciaRota
) {
    public DadosListaRotas(Rotas rotas){
        this(rotas.getRotaid(), rotas.getNomeDaRota(), rotas.getDataDaColeta(), rotas.getDistanciaRota(), rotas.getTipoRota(), rotas.getFrequenciaRota());
    }
}

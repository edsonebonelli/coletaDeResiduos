package br.com.fiap.coletaDeResiduos.domain;

import br.com.fiap.coletaDeResiduos.dto.DadosAtualizarRotas;
import br.com.fiap.coletaDeResiduos.dto.DadosCadastroRotas;
import br.com.fiap.coletaDeResiduos.enums.FrequenciaRota;
import br.com.fiap.coletaDeResiduos.enums.TipoRota;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;
@Table(name = "rotas")
@Entity(name = "Rotas")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Rotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rotaid;
    private String nomeDaRota;
    private LocalDate dataDaColeta;
    private LocalTime horaDeInicio;
    private LocalTime horaDeTermino;
    private String distanciaRota;

    @Enumerated(EnumType.STRING)
    private TipoRota tipoRota;

    @Enumerated(EnumType.STRING)
    private FrequenciaRota frequenciaRota;

    private Boolean ativo;

    public Rotas(){

    }
    public Rotas(DadosCadastroRotas dados) {
        this.rotaid = dados.rotaid();
        this.nomeDaRota = dados.nomeDaRota();
        this.dataDaColeta = dados.dataDaColeta();
        this.horaDeInicio = dados.horaDeInicio();
        this.horaDeTermino = dados.horaDeTermino();
        this.distanciaRota = dados.distanciaRota();
        this.tipoRota = dados.tipoRota();
        this.frequenciaRota = dados.frequenciaRota();
        this.ativo = true;
    }
    public Long getRotaid() {
        return rotaid;
    }
    public String getNomeDaRota() {
        return nomeDaRota;
    }
    public LocalDate getDataDaColeta() {
        return dataDaColeta;
    }
    public String getDistanciaRota() {
        return distanciaRota;
    }
    public TipoRota getTipoRota() {
        return tipoRota;
    }
    public FrequenciaRota getFrequenciaRota() {
        return frequenciaRota;
    }
    public void atualizarInformacoes(DadosAtualizarRotas dados) {
        if (dados.nomeDaRota() != null){
            this.nomeDaRota = dados.nomeDaRota();
        }
        if (dados.dataDaColeta() != null){
            this.dataDaColeta = dados.dataDaColeta();
        }
        if (dados.tipoRota() != null){
            this.tipoRota = dados.tipoRota();
        }
        if (dados.frequenciaRota() != null){
            this.frequenciaRota = dados.frequenciaRota();
        }
    }
    public void excluir() {
        this.ativo = false;
    }
}

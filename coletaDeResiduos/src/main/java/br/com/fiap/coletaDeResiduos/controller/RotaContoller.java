package br.com.fiap.coletaDeResiduos.controller;

import br.com.fiap.coletaDeResiduos.dto.DadosAtualizarRotas;
import br.com.fiap.coletaDeResiduos.dto.DadosCadastroRotas;
import br.com.fiap.coletaDeResiduos.dto.DadosListaRotas;
import br.com.fiap.coletaDeResiduos.domain.Rotas;
import br.com.fiap.coletaDeResiduos.repository.RotaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rotas")
public class RotaContoller {
    @Autowired
    private RotaRepository rotaRepository;
    @PostMapping
    @Transactional
    public void cadastroRotas(@RequestBody @Valid List<DadosCadastroRotas> dados){
        for (DadosCadastroRotas dadosCadastroRotas : dados)
            rotaRepository.save(new Rotas(dadosCadastroRotas));
    }
    @GetMapping
    public List<DadosListaRotas> listarRotas(){
        return rotaRepository.findAll().stream().map(DadosListaRotas::new).toList();
    }
    @PutMapping
    @Transactional
    public void atualizarRotas(@RequestBody @Valid DadosAtualizarRotas dados){
        var rota = rotaRepository.getReferenceById(dados.id());
        rota.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluirRota(@PathVariable Long id){
        var rota = rotaRepository.getReferenceById(id);
        rota.excluir();
    }
}





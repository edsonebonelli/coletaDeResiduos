package br.com.fiap.coletaDeResiduos.controller;

import br.com.fiap.coletaDeResiduos.dto.DadosAtualizarCliente;
import br.com.fiap.coletaDeResiduos.dto.DadosCadastroCliente;
import br.com.fiap.coletaDeResiduos.dto.DadosDetalheCliente;
import br.com.fiap.coletaDeResiduos.dto.DadosListaCliente;
import br.com.fiap.coletaDeResiduos.domain.Cliente;
import br.com.fiap.coletaDeResiduos.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastroCliente(@RequestBody @Valid DadosCadastroCliente dados, UriComponentsBuilder uriBuilder){
        var cliente = new Cliente(dados);
        clienteRepository.save(cliente);
        var uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getClienteid()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalheCliente(cliente));
    }
    @GetMapping
    public ResponseEntity<List<DadosListaCliente>> listarClientes(Pageable pageable){
        var list = clienteRepository.findAllByAtivoTrue(pageable).stream().map(DadosListaCliente::new).toList();
        return ResponseEntity.ok(list);
    }
    @PutMapping
    @Transactional
    public ResponseEntity atualizarClientes(@RequestBody @Valid DadosAtualizarCliente dados){
        var cliente = clienteRepository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosDetalheCliente(cliente));
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluirClientes(@PathVariable Long id){
        var cliente = clienteRepository.getReferenceById(id);
        cliente.excluir();
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity detalharClientes(@PathVariable Long id){
        var cliente = clienteRepository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalheCliente(cliente));
    }
}

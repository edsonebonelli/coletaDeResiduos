package br.com.fiap.coletaDeResiduos.repository;

import br.com.fiap.coletaDeResiduos.domain.Rotas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RotaRepository extends JpaRepository<Rotas, Long> {
}

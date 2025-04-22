package br.com.fiap.coletaDeResiduos.repository;

import br.com.fiap.coletaDeResiduos.domain.user.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login);
}

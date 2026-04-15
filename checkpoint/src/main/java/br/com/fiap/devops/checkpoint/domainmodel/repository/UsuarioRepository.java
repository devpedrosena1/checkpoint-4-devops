package br.com.fiap.devops.checkpoint.domainmodel.repository;

import br.com.fiap.devops.checkpoint.domainmodel.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

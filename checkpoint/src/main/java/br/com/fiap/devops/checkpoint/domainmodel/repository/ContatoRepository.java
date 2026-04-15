package br.com.fiap.devops.checkpoint.domainmodel.repository;

import br.com.fiap.devops.checkpoint.domainmodel.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
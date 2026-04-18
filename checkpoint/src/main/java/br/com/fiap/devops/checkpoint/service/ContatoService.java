package br.com.fiap.devops.checkpoint.service;

import br.com.fiap.devops.checkpoint.domainmodel.Contato;

import java.util.List;

public interface ContatoService {

    Contato salvar(Contato contato);

    List<Contato> listar();

    void deletar(Long id);
}

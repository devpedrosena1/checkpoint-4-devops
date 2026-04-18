package br.com.fiap.devops.checkpoint.service;

import br.com.fiap.devops.checkpoint.domainmodel.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario salvar(Usuario usuario);

    List<Usuario> listar();

    Usuario buscarPorId(Long id);

    Usuario atualizar(Long id, Usuario usuario);

    void deletar(Long id);
}

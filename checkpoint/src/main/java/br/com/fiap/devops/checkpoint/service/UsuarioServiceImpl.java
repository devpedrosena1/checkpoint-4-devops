package br.com.fiap.devops.checkpoint.service;

import br.com.fiap.devops.checkpoint.domainmodel.Usuario;
import br.com.fiap.devops.checkpoint.domainmodel.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario salvar(Usuario usuario) {

        if (usuario.getContatos() != null) {
            usuario.getContatos().forEach(contato -> {
                contato.setUsuario(usuario);
            });
        }

        return repository.save(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return repository.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @Override
    public Usuario atualizar(Long id, Usuario usuario) {
        Usuario existente = buscarPorId(id);
        existente.setNome(usuario.getNome());
        existente.setEmail(usuario.getEmail());
        return repository.save(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
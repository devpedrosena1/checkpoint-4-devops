package br.com.fiap.devops.checkpoint.service;

import br.com.fiap.devops.checkpoint.domainmodel.Contato;
import br.com.fiap.devops.checkpoint.domainmodel.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoServiceImpl implements ContatoService {

    private final ContatoRepository repository;

    public ContatoServiceImpl(ContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Contato salvar(Contato contato) {
        return repository.save(contato);
    }

    @Override
    public List<Contato> listar() {
        return repository.findAll();
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

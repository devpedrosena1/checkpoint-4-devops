package br.com.fiap.devops.checkpoint.controller;

import br.com.fiap.devops.checkpoint.domainmodel.Contato;
import br.com.fiap.devops.checkpoint.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @PostMapping
    public Contato criar(@RequestBody Contato contato) {
        return service.salvar(contato);
    }

    @GetMapping
    public List<Contato> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

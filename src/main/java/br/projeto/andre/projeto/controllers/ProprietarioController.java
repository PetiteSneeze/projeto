package br.projeto.andre.projeto.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.projeto.andre.projeto.Models.Proprietario;
import br.projeto.andre.projeto.repository.ProprietarioRepository;

@RestController
@RequestMapping("/proprietario")
public class ProprietarioController {
    @Autowired
    private ProprietarioRepository repository;

    @PostMapping
    public Proprietario postInserir(@RequestBody Proprietario entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public Proprietario putAlterar(@RequestBody Proprietario entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<Proprietario> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public Proprietario getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
}

package br.projeto.andre.projeto.controllers;
import org.springframework.web.bind.annotation.RestController;

import br.projeto.andre.projeto.Models.ImplementoseMaquinas;
import br.projeto.andre.projeto.repository.ImplementoseMaquinasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/implementosemaquinas")

public class ImplementoseMaquinasController {
    @Autowired
    private ImplementoseMaquinasRepository repository;

    @PostMapping
    public ImplementoseMaquinas postInserir(@RequestBody ImplementoseMaquinas entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public ImplementoseMaquinas putAlterar(@RequestBody ImplementoseMaquinas entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<ImplementoseMaquinas> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public ImplementoseMaquinas getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
}

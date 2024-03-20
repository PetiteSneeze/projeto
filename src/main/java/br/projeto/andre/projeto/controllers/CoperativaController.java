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

import br.projeto.andre.projeto.Models.Coperativa;
import br.projeto.andre.projeto.repository.CoperativaRepository;

@RestController
@RequestMapping("/coperativa")
public class CoperativaController {

    @Autowired
    private CoperativaRepository repository;

    @PostMapping
    public Coperativa postInserir(@RequestBody Coperativa entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public Coperativa putAlterar(@RequestBody Coperativa entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<Coperativa> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public Coperativa getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
}

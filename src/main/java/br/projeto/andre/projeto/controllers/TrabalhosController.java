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

import br.projeto.andre.projeto.Models.Trabalhos;
import br.projeto.andre.projeto.repository.TrabalhosRepository;

@RestController
@RequestMapping("/trabalhos")
public class TrabalhosController {
    @Autowired
    private TrabalhosRepository Repository;

    @PostMapping
    public Trabalhos postInserir(@RequestBody Trabalhos entity) {
        Repository.save(entity);
        return entity;
    }
    @PutMapping
    public Trabalhos putAlterar(@RequestBody Trabalhos entity) {
        Repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    Repository.deleteById(id);
    }
    @GetMapping
    public Iterable<Trabalhos> getSelecionar(){
        return Repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public Trabalhos getPorId(@PathVariable int id) {
        return Repository.selecionar(id);
    }

}

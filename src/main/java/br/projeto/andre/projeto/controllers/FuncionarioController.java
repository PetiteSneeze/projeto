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
import br.projeto.andre.projeto.Models.Funcionario;
import br.projeto.andre.projeto.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
  @Autowired
  private FuncionarioRepository repository;

    @PostMapping
    public Funcionario postInserir(@RequestBody Funcionario entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public Funcionario putAlterar(@RequestBody Funcionario entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<Funcionario> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public Funcionario getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
}

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
import br.projeto.andre.projeto.Models.TipoPagamento;
import br.projeto.andre.projeto.repository.TipoPagamentoRepository;

@RestController
@RequestMapping("/tipopagamento")

public class TipoPagamentoController {
    @Autowired
    private TipoPagamentoRepository repository;

    @PostMapping
    public TipoPagamento postInserir(@RequestBody TipoPagamento entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public TipoPagamento putAlterar(@RequestBody TipoPagamento entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<TipoPagamento> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public TipoPagamento getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
  }


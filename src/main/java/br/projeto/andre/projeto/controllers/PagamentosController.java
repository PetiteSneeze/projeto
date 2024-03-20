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
import br.projeto.andre.projeto.Models.Pagamentos;
import br.projeto.andre.projeto.repository.PagamentosRepository;

@RestController
@RequestMapping("/pagamentos")

public class PagamentosController {
    @Autowired
    private PagamentosRepository repository;

    @PostMapping
    public Pagamentos postInserir(@RequestBody Pagamentos entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public Pagamentos putAlterar(@RequestBody Pagamentos entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<Pagamentos> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public Pagamentos getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
}

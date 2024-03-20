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
import br.projeto.andre.projeto.Models.ProdutosGalpao;
import br.projeto.andre.projeto.repository.ProdutosGalpaoRepository;

@RestController
@RequestMapping("/produtosGalpao")
public class ProdutosGalpaoController {
    @Autowired
    private ProdutosGalpaoRepository repository;

    @PostMapping
    public ProdutosGalpao postInserir(@RequestBody ProdutosGalpao entity) {
        repository.save(entity);
        return entity;
    }
    @PutMapping
    public ProdutosGalpao putAlterar(@RequestBody ProdutosGalpao entity) {
        repository.save(entity);
        return entity;
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
    repository.deleteById(id);
    }
    @GetMapping
    public Iterable<ProdutosGalpao> getSelecionar(){
        return repository.findAll();
    }
    @GetMapping("/selecionar/{id}")
    public ProdutosGalpao getPorId(@PathVariable int id) {
        return repository.selecionar(id);
    }
}

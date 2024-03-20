package br.projeto.andre.projeto.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.ProdutosGalpao;

public interface ProdutosGalpaoRepository 
    extends CrudRepository<ProdutosGalpao, Integer>{
      @Query(value = "select * from produtosGalpao where id=?1",
      nativeQuery = true)
      ProdutosGalpao selecionar(int id);
}

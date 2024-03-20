package br.projeto.andre.projeto.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.Pagamentos;

public interface PagamentosRepository 
    extends CrudRepository<Pagamentos, Integer>{
         @Query(value = "select * from pagamentos where id=?1",
        nativeQuery = true)
        Pagamentos selecionar(int id);
}

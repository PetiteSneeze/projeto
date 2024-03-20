package br.projeto.andre.projeto.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.Coperativa;

public interface CoperativaRepository 
    extends CrudRepository<Coperativa, Integer>{
        @Query(value = "select * from coperativa where id=?1",
        nativeQuery = true)
        Coperativa selecionar(int id);
}

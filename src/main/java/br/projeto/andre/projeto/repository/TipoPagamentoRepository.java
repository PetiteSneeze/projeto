package br.projeto.andre.projeto.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.TipoPagamento;

public interface TipoPagamentoRepository 
    extends CrudRepository<TipoPagamento, Integer>{
        @Query(value = "select * from tipopagamento where id=?1",
        nativeQuery = true)
        TipoPagamento selecionar(int id);
}

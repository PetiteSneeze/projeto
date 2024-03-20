package br.projeto.andre.projeto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.ImplementoseMaquinas;

public interface ImplementoseMaquinasRepository 
    extends CrudRepository<ImplementoseMaquinas, Integer> {
        @Query(value = "select * from implementosemaquinas where id=?1",
        nativeQuery = true)
        ImplementoseMaquinas selecionar(int id);
}

package br.projeto.andre.projeto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.Trabalhos;

public interface TrabalhosRepository
    extends CrudRepository<Trabalhos, Integer>{
        @Query(value = "select * from trabalhos where id=?1",
        nativeQuery = true)
        Trabalhos selecionar(int id);
}

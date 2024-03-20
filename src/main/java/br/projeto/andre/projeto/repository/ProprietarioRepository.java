package br.projeto.andre.projeto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.projeto.andre.projeto.Models.Proprietario;

public interface ProprietarioRepository
    extends CrudRepository<Proprietario, Integer>{
        @Query(value = "select * from proprietario where id=?1",
        nativeQuery = true)
        Proprietario selecionar(int id);
}


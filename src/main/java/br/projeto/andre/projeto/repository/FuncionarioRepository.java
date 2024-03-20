package br.projeto.andre.projeto.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.projeto.andre.projeto.Models.Funcionario;

public interface FuncionarioRepository 
    extends CrudRepository<Funcionario, Integer> {
        @Query(value = "select * from funcionario where id=?1",
        nativeQuery = true)
        Funcionario selecionar(int id);
}

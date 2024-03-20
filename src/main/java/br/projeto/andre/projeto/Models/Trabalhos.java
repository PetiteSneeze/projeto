package br.projeto.andre.projeto.Models;
import java.sql.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Trabalhos")
public class Trabalhos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String trabalho;
    private Date inicio;
    private Date fim;
    private String local;

     @OneToMany(mappedBy="trabalhos")
    private List<Funcionario>funcionario;
}

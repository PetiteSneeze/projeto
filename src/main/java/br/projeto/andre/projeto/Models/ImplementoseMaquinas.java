package br.projeto.andre.projeto.Models;
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
@Table(name="implementosemaquinas")
public class ImplementoseMaquinas {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String potencia;
    private String operador;
    private String funcao;
    private String localdeTrabalho;

    @OneToMany(mappedBy="implementoseMaquinas")
    private List<Proprietario> proprietario;

      
}

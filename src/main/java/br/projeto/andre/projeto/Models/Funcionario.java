package br.projeto.andre.projeto.Models;
import java.sql.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Date dataNascimento;
    private Date dataAdmissao;
    private Date dataDemissao;
    private String funcao;
    private float salario;
    private float comissao;

    @OneToMany(mappedBy="funcionario")
    private List<Proprietario>proprietario;

    @ManyToOne
    @JoinColumn(name="idTrabalhos")
    private Trabalhos trabalhos;

  
}

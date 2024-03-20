package br.projeto.andre.projeto.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="proprietario")

public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String idade;
    private String cidade;
    private String estado;
    private String areaTotal;
    private String segmento;

    @ManyToOne
    @JoinColumn(name="idGalpao")
    private ProdutosGalpao produtosGalpao;
    @ManyToOne
    @JoinColumn(name="idFuncionario")
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn(name="idCoperativa")
    private Coperativa coperativa;
    @ManyToOne
    @JoinColumn(name="idImplementoseMaquinas")
    private ImplementoseMaquinas implementoseMaquinas;


}


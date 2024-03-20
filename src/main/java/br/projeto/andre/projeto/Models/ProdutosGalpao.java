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
@Table(name="produtosGalpao")
public class ProdutosGalpao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String Finalidade;
    private String principioAtivo;
    private String dosagemAlq;
    private String qtdDisponivel;
    private float valorUnitario;

    @OneToMany(mappedBy="produtosGalpao")
    private List<Proprietario>proprietario;
}

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
@Table(name="coperativa")
public class Coperativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String regiao;
    private String atendente;
    private String Agronomo;
    private String produtos;
    private String quantidade;
    private String Segmento;

    @OneToMany(mappedBy="coperativa")
    private List<Proprietario>proprietario;

}

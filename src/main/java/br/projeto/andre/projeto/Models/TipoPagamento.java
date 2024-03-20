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
@Table(name="tipopagamento")
public class TipoPagamento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String tipo;
    private Date dataPagamento;

    @OneToMany(mappedBy="tipopagamento")
    private List<Pagamentos>pagamentos;
}

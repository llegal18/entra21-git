package com.entra21.primeiroprojetospring.model.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "item")
@Data
public abstract class ItemEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor_venda")
    private Double valorVenda;

    @Column(name = "valor_locacao")
    private Double valorLocacao;

    @Column(name = "emprestado")
    private Boolean emprestado;

    @ManyToOne
    @JoinColumn(name = "id_franquia", referencedColumnName = "id")
    private FranquiaEntity franquia;

    @OneToMany(mappedBy = "item")
    private Set<AvaliacaoEntity> avaliacoes;

    @ManyToMany
    @JoinTable(
            name = "genero_item",
            joinColumns = @JoinColumn(name = "id_item"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private Set<GeneroEntity> generos;
}

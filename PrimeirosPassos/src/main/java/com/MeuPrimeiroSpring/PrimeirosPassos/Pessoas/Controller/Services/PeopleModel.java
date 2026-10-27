package com.MeuPrimeiroSpring.PrimeirosPassos.Pessoas.Controller.Services;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_cadastros")
public class PeopleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(name = "Email", unique = true)
    private String email;

    @Column(name = "Idade")
    private Integer idade;
}

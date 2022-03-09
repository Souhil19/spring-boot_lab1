package com.esisba.exemple_cours.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="etudiant_table")
@Data @AllArgsConstructor  @NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20)
    private String nom;

    @Column(nullable = false)
    private String email;

    @OneToOne
    private Formation formation;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

}

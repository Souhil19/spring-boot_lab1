package com.esisba.exemple_cours.repository;

import com.esisba.exemple_cours.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantByNom(String nom);

    @Query("SELECT e FROM Etudiant e where e.email like %:domain%")
    List<Etudiant> findEtudiantByDomainInEmail(@Param("domain") String domain);



    @Override
    List<Etudiant> findAll();
}

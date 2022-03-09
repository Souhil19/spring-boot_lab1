package com.esisba.exemple_cours.repository;

import com.esisba.exemple_cours.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {

}

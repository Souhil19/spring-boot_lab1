package com.esisba.exemple_cours;


import com.esisba.exemple_cours.entities.Etudiant;
import com.esisba.exemple_cours.entities.EtudiantProjection;
import com.esisba.exemple_cours.repository.EtudiantRepository;
import com.esisba.exemple_cours.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class ExempleCoursApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    FormationRepository formationRepository;


    public static void main(String[] args) {
        SpringApplication.run(ExempleCoursApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        etudiantRepository.save(
                new Etudiant(null, "Souhil","s.omari@esi-sba.dz",null,
                        Date.valueOf("1989-04-20")));
        etudiantRepository.save(
                new Etudiant(null, "Amine","a.omari@esi-sba.dz",null,
                        Date.valueOf("1999-04-20")));


        etudiantRepository.findAll().forEach(System.out::println);

    }
}

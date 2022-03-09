package com.esisba.exemple_cours.APIs;

import com.esisba.exemple_cours.entities.Etudiant;
import com.esisba.exemple_cours.repository.EtudiantRepository;
import com.esisba.exemple_cours.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("etudiant-api")
public class EtudiantController {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    FormationRepository formationRepository;

    @GetMapping
    public List<Etudiant> getEtudiantNom(String Nom){
        return etudiantRepository.findEtudiantByNom(Nom);
    }
    @GetMapping("/etudiant/all") //GET http://localhost:8081/client-api/client/all
    public List<Etudiant> getEtudiants() {
        return etudiantRepository.findAll();
    }

    /*@GetMapping("/etudiant/{domain}")
    public List<Etudiant> getEtudiantEmaill(@PathVariable("domain") String Domain){
        return etudiantRepository.findEtudiantByDomainInEmail(Domain);
    }*/
}

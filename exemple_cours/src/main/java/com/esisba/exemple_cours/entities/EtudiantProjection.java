package com.esisba.exemple_cours.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="pr1", types=Etudiant.class)
public interface EtudiantProjection {

    @Value("#{target.nom}")
    public String getName();

    @Value("#{target.email}")
    public String getEmail();

    @Value("#{target.formation}")
    public String getFormation();
}

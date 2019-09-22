package com.naim.mspres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


import java.util.Date;

@SpringBootApplication
public class MsPresApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private FormationRepository formationRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(MsPresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        repositoryRestConfiguration.exposeIdsFor(Formation.class,Etudiant.class);

        Formation f1 = formationRepository.save(new Formation(null,"angular",7,null));
        Formation f2 = formationRepository.save(new Formation(null,"spring",15,null));
        Formation f3 = formationRepository.save(new Formation(null,"java",20,null));

        etudiantRepository.save(new Etudiant(null, "bouhalit", "naim", new Date(),f1));
        etudiantRepository.save(new Etudiant(null, "kadi", "redouane", new Date(),f2));
        etudiantRepository.save(new Etudiant(null, "kennai", "krimo", new Date(),f3));
        etudiantRepository.save(new Etudiant(null, "lakrout", "ahmed", new Date(),f3));



    }
}

package ma.emsi.springdataresttp.SpringDataRestTp;

import ma.emsi.springdataresttp.SpringDataRestTp.entities.Centre;
import ma.emsi.springdataresttp.SpringDataRestTp.entities.Etudiant;
import ma.emsi.springdataresttp.SpringDataRestTp.entities.Genre;
import ma.emsi.springdataresttp.SpringDataRestTp.repositories.CentreRepository;
import ma.emsi.springdataresttp.SpringDataRestTp.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestTpApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestTpApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Centre c1 = centreRepository.save(
                Centre.builder().nom_centre("Centre EMSI Casa").adresse("Casablanca").build()
        );

        etudiantRepository.save(
                Etudiant.builder().nom("Adnani").prenom("Morad").genre(Genre.Homme).centre(c1).build()
        );
        etudiantRepository.save(
                Etudiant.builder().nom("Sara").prenom("Benali").genre(Genre.Femme).centre(c1).build()
        );
    }

}

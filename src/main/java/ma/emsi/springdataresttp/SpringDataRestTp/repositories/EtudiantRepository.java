package ma.emsi.springdataresttp.SpringDataRestTp.repositories;

import ma.emsi.springdataresttp.SpringDataRestTp.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;
import java.util.List;

//@RepositoryRestResource(path = "students")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantsByNom(@Param("nom") String nom);
}
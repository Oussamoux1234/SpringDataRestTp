package ma.emsi.springdataresttp.SpringDataRestTp.repositories;

import ma.emsi.springdataresttp.SpringDataRestTp.entities.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "centres")
public interface CentreRepository extends JpaRepository<Centre, Long> {
}

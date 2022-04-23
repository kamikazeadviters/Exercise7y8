package Repositories;

import Models.PostulantDB;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface IPostulantRepository extends CrudRepository<PostulantDB, Integer> {
    @Query("select x from PostulantDB x where x.name = ?1 and x.birth= ?2")
    Optional<PostulantDB> findByNameAndBirth(String name, LocalDate birth);
}

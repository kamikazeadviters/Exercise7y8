package Repositories;

import Models.ProfessorDB;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IProfessorRepository extends CrudRepository<ProfessorDB, Integer>
{
@Query("select x from PostulantDB x where x.name = ?1 and x.birth= ?2")
    Optional<ProfessorDB> findByNameAndSubject(String name, int idSubject);
}

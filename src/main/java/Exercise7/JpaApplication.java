package Exercise7;

import Models.PostulantDB;
import Models.ProfessorDB;
import Repositories.IPostulantRepository;
import Repositories.IProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner
{
	@Autowired
	IPostulantRepository postulantRepository;
	@Autowired
	 IProfessorRepository professorRepository;
	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);
	}
	@Override
	public void run(String...args) {
		var postulant1 = new PostulantDB(1, "nuevo",
				"postulante", LocalDate.of(1992, 5, 23),
				40250326, 1.80,95,1,
				1, 1);
		var professor1 = new ProfessorDB(1,"nuevo","profesor",
				LocalDate.of(1987, 23, 02),
				25412365,1.75,85, 3,
				15);

	}


}


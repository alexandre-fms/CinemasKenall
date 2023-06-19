package fr.fms;

import fr.fms.dao.CategoriesRepository;
import fr.fms.dao.CinemasRepository;
import fr.fms.dao.MoviesRepository;
import fr.fms.entities.Categories;
import fr.fms.entities.Cinemas;
import fr.fms.entities.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class CinemaKenallApplication implements CommandLineRunner {

    @Autowired
    CategoriesRepository categoriesRepo;
    @Autowired
    MoviesRepository moviesRepo;
    @Autowired
    CinemasRepository cinemasRepo;

    public static void main(String[] args) {
        SpringApplication.run(CinemaKenallApplication.class, args);
    }

    @Transactional

    @Override
    public void run(String... args) throws Exception {

        dataGenerator();
    }

    private void dataGenerator() {

        Categories horror = categoriesRepo.save(new Categories(null, "horreur"));
        Categories drama = categoriesRepo.save(new Categories(null, "drame"));
        Categories comedy = categoriesRepo.save(new Categories(null, "comédie"));
        Categories young = categoriesRepo.save(new Categories(null, "jeunesse"));
        Categories family = categoriesRepo.save(new Categories(null, "famille"));
        Categories adult = categoriesRepo.save(new Categories(null, "adulte"));
        Categories war = categoriesRepo.save(new Categories(null, "guerre"));
        Categories sfiction = categoriesRepo.save(new Categories(null, "science-fiction"));
        Categories love = categoriesRepo.save(new Categories(null, "romantique"));
        Categories anime = categoriesRepo.save(new Categories(null, "animation japonaise"));
        Categories history = categoriesRepo.save(new Categories(null, "historique"));


        //cinemasRepo.save(new Cinemas(null, "l'excellent kenall", "10 avenue chambellant", 64750, "Saperlipaupiette de veau"));

    }


}

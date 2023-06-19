package fr.fms.dao;

import fr.fms.entities.Cinemas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemasRepository extends JpaRepository<Cinemas, Long> {
}

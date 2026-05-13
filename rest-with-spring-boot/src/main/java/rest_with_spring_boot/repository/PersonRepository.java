package rest_with_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_with_spring_boot.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

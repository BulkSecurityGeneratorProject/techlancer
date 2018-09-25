package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.domain.TypeService;

import java.util.List;

@Repository
public interface TypeServiceRepository extends JpaRepository<TypeService, Long> {

    List<TypeService> findAllByCategoryId(Long id);

}

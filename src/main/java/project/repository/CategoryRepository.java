package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
}

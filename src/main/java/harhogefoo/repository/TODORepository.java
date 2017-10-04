package harhogefoo.repository;

import harhogefoo.entitiy.TODO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * author shinocchi.
 * Created on 2017/10/04.
 */
@Repository
public interface TODORepository extends JpaRepository<TODO, Long> {
}

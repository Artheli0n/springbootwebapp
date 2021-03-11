package spring.training.personal.repositories;

import spring.training.personal.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer>{
}

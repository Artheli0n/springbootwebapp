package spring.training.personal.services;

import spring.training.personal.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}

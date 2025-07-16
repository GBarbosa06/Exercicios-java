package dio.RestfulAPI.service.impl;

import dio.RestfulAPI.domain.model.User;

public interface UserService {
    User findById(Long id);

    User createUser(User userToCreate);
}

package com.enkel.dreamshops.service.user;

import com.enkel.dreamshops.model.User;
import com.enkel.dreamshops.request.CreateUserRequest;
import com.enkel.dreamshops.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);
}

package com.messengerapp.demo.messengerapp.controollers;

import com.messengerapp.demo.messengerapp.models.LoggedInUser;
import com.messengerapp.demo.messengerapp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserModel, Long> {


    @Query("SELECT u FROM users  u where (u.email=:loginData OR u.phone=:loginData) AND u.password=:password")
    UserModel isUserExists(String loginData, String password);

}

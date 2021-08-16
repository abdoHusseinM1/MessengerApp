package com.messengerapp.demo.messengerapp.controollers;

import com.messengerapp.demo.messengerapp.models.LoggedInUser;
import com.messengerapp.demo.messengerapp.models.UserModel;
import com.messengerapp.demo.messengerapp.utils.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserModel> getAllUsers() {
        return userRepo.findAll();
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String registerNewUser(@RequestBody UserModel user) {
        userRepo.save(user);
        return "Added Successfully";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public DataResponse loginUser(@RequestBody UserModel userModel) {
        DataResponse dataResponse = null;
        LoggedInUser loggedInUser = null;
        if (userModel.getEmail() != null) {
            UserModel currentUser = userRepo.isUserExists(userModel.getEmail(), userModel.getPassword());
         loggedInUser=new LoggedInUser(currentUser);
         if (loggedInUser != null)
                dataResponse = new DataResponse(200, "LoggedIn Successfully", loggedInUser);
            else dataResponse = new DataResponse(401, "Invalid email or password", null);
        } else if (userModel.getPhone() != null) {
            UserModel currentUser = userRepo.isUserExists(userModel.getEmail(), userModel.getPassword());
            loggedInUser=new LoggedInUser(currentUser);
            if (loggedInUser != null)
                dataResponse = new DataResponse(200, "LoggedIn Successfully", loggedInUser);
            else dataResponse = new DataResponse(401, "Invalid email or password", null);
        } else dataResponse = new DataResponse(401, "Invalid email or password", null);

        return dataResponse;
    }

}

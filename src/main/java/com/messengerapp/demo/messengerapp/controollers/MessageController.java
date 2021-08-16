package com.messengerapp.demo.messengerapp.controollers;

import com.messengerapp.demo.messengerapp.models.MessageModel;
import com.messengerapp.demo.messengerapp.models.UserModel;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    @Autowired
    MessageRepo messageRepo;

    @RequestMapping(value = "/addMessage", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE)
    public String registerNewUser(@RequestBody MessageModel messageModel){
        messageRepo.save(messageModel);
        return "Message sent Successfully";
    }


}

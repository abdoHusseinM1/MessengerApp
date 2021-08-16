package com.messengerapp.demo.messengerapp.controollers;

import com.messengerapp.demo.messengerapp.models.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<MessageModel , Long> {


}

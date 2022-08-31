package app.demo.service;

import app.demo.payload.Message;
import app.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public void insertMessage(final Message data) {
        messageRepository.save(data);
    }
}

package app.demo.consumer;

import app.demo.payload.Message;
import app.demo.service.MessageService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    MessageService messageService;

    @KafkaListener(topics = "demo-app-topic")
    public void processMessage(Message data) {
        if (data == null) {
            System.out.println("Message received is null");
        } else {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(data);
            System.out.println(json);
            messageService.insertMessage(data);
        }
    }
}

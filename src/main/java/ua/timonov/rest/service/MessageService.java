package ua.timonov.rest.service;

import ua.timonov.rest.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 26.12.2016.
 */
public class MessageService {

    public List<Message> getAllMessages() {
        Message m1 = new Message(1L, "Hello World", "Alex");
        Message m2 = new Message(2L, "Hello Jersey", "Max");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;
    }
}

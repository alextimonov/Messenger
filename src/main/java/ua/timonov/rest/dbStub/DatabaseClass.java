package ua.timonov.rest.dbStub;

import ua.timonov.rest.model.Message;
import ua.timonov.rest.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

     // THREAD NOT SAFE!!!
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}

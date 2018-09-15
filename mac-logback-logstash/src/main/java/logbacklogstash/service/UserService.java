package logbacklogstash.service;

import logbacklogstash.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    private final static Logger log = LoggerFactory.getLogger(UserService.class);

    public void insert() {
        UserRepository userRepository = new UserRepository();
        try {
            userRepository.insert();
        } catch (Exception e) {
            log.error("Error when insert user", e);
        }
    }

}

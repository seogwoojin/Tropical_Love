package Tropical.Love.demo;

import Tropical.Love.demo.user.repository.UserRepository;
import Tropical.Love.demo.user.service.UserService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private final EntityManager em;

    public AppConfig(EntityManager em) {
        this.em = em;
    }

}

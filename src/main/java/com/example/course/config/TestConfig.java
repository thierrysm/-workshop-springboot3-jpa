package com.example.course.config;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        var u1 = new User(null, "Thierry", "thierry@gmail.com", "40228922", "323145");
        var u2 = new User(null, "Messi", "messi10@gmail.com", "48431044", "34999833");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

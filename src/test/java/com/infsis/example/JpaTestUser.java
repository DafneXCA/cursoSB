package com.infsis.example;

import com.infsis.example.Models.User;
import com.infsis.example.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JpaTestUser {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testPersist() throws Exception{
        User user=new User();
        user.setName("x");
        user.setEmail("x@x");
        this.entityManager.persist(user);

        Optional<User> userOptional=userRepository.findById(1);
        assertThat(userOptional.get().getName()).isEqualTo("x");
    }
}

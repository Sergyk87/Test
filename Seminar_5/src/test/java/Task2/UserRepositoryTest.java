package Task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository;
    UserRepository userRepositoryMock;
    @BeforeEach
    void setUp() {
        User user = new User("Иван Петров", "ipetrov@yandex.ru");
        userRepositoryMock = mock(UserRepository.class);
    }

    @AfterEach
    void tearDown() {
        userRepository = null;
    }

    @Test
    void addUser() {
    }

    @Test
    void getUserByUsername() {
    }
}
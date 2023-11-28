package Task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    User user;
    UserRepository userRepository;
    UserRepository userRepositoryMock;
    @BeforeEach
    void setUp() {
        user = new User("Иван Петров", "ipetrov@yandex.ru");
        userRepositoryMock = mock(UserRepository.class);
        userRepository = new UserRepository();
    }

    @AfterEach
    void tearDown() {
        user = null;
        userRepository = null;
    }

    @Test
    void addUser() {
        userRepositoryMock.addUser(user);
        verify(userRepositoryMock).addUser(user);
    }

    @Test
    void getUserByUsername() {
        userRepository.addUser(user);
        assertEquals(user, userRepository.getUserByUsername("Иван Петров"));
    }
}
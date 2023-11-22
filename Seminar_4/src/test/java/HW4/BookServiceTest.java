package HW4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BookServiceTest {
    Book book;
    BookRepository repoMock;
    BookService bookService;

    @BeforeEach
    void setUp(){
        repoMock = mock(BookRepository.class);
        bookService = new BookService(repoMock);
        book = new Book("1", "Мастер и Маргарита", "М.А.Булгаков");
    }

    @Test
    void testFindBookById(){
        bookService.findBookById("1");

        verify(repoMock).findById("1");
    }

    @Test
    void testFindAllBooks(){
        bookService.findAllBooks();

        verify(repoMock).findAll();
    }
}
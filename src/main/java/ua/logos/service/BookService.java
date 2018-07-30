package ua.logos.service;

import java.util.List;

import ua.logos.domain.BookDTO;
import ua.logos.entity.Book;

public interface BookService {

	void saveBook(BookDTO bookDTO);

	BookDTO findById(Long id);

	List<BookDTO> findAllBooks();

	void deleteBook(Long id);
}

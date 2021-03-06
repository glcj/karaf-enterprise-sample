package de.nierbeck.apachecon.persistence.api;

import java.util.List;

import de.nierbeck.apachecon.persistence.entity.Book;
import de.nierbeck.apachecon.persistence.entity.Recipe;

public interface CookBookService {

	Book getBookByName(String name);

	Book getBookByIsbn(String isbn);

	void addRecipeToCookBook(Book book, Recipe recipe);

	void createBook(Book book);

	List<Book> getAllBooks();

	List<Book> getAllBooksDetached();

	Book getBookById(Long id);

}

package com.Dao;

import java.util.List;

import com.Model.Book;

public interface BookDao {
	public Integer addBook(Book book);
	public List<Book> getAllBooks();
    public void deleteBook(Integer id);
	public Integer getIdByBook(String name);
    public Book getBookById(int id);
    public Integer updateBook(Book book);

}

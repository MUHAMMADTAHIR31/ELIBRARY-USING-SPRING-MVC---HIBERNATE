/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elibrary.dao;

import com.elibrary.entity.BookBean;
import com.elibrary.entity.IssueBookBean;
import com.elibrary.entity.LibrarianBean;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ElibraryDAO {
    
    //Books CRUD
    public List<BookBean> getBooks();
    public void  saveBooks(BookBean theBean);
    public BookBean updateBooks(String theId);
    public void deleteBooks(String theId);
    
    
    //Librarian CRUD
    public List<LibrarianBean> getLibrarain();
    public void saveLibrarian(LibrarianBean theLibrarian);
    public LibrarianBean updateLibrarian(int theId);
    public void deleteLibrarian(int theId);
    public LibrarianBean loginLibrarian(String userEmail);
    
    //Issued Book CRUD
    public List<IssueBookBean> getIssueBook();
    public void saveIssueBook(IssueBookBean theIssueBookBean);
    
}

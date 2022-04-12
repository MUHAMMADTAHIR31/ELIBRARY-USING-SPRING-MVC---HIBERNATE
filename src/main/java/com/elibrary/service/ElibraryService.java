/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elibrary.service;

import com.elibrary.entity.BookBean;
import com.elibrary.entity.IssueBookBean;
import com.elibrary.entity.LibrarianBean;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ElibraryService {
    
    //Librarian Services
    public List<LibrarianBean> getLibrarian();
    public void saveLibrarian(LibrarianBean theLibrarianBean);
    public LibrarianBean updateLibrarian(int theId);
    public void deleteLibrarian(int theId);
    public LibrarianBean loginLibrarian(String userEmail);
    
    // Books Services
    public List<BookBean> getBooks();
    public void saveBooks(BookBean theBook);
    public BookBean updateBooks(String theId);
    public void deleteBooks(String theId);
    
    //Issued Book
    public List<IssueBookBean> getIssuedBook();
    public void saveIssuedBook(IssueBookBean theIssueBookBean);
    
}

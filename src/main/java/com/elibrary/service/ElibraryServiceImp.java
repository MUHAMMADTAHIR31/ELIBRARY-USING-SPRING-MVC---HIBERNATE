/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elibrary.service;

import com.elibrary.dao.ElibraryDAO;
import com.elibrary.entity.BookBean;
import com.elibrary.entity.IssueBookBean;
import com.elibrary.entity.LibrarianBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dell
 */
@Service
public class ElibraryServiceImp implements ElibraryService{

    @Autowired
    private ElibraryDAO elibraryDAO;
    
    // ---------- Librarian Services=----
    @Override
    @Transactional
    public List<LibrarianBean> getLibrarian() {
        return elibraryDAO.getLibrarain();
    }
    
    @Override
    @Transactional
    public void saveLibrarian(LibrarianBean theLibrarianBean){
        elibraryDAO.saveLibrarian(theLibrarianBean);
    }
    
    @Override
    @Transactional
    public LibrarianBean updateLibrarian(int theId) {
        return elibraryDAO.updateLibrarian(theId);
    }
    
    @Override
    @Transactional
    public void deleteLibrarian(int theId) {
        elibraryDAO.deleteLibrarian(theId);
    }

    @Override
    @Transactional
    public LibrarianBean loginLibrarian(String userEmail) {
        return elibraryDAO.loginLibrarian(userEmail);
    }

    ///-------------Books
    @Override
    @Transactional
    public List<BookBean> getBooks(){
        return elibraryDAO.getBooks();
    }
     
    @Override
    @Transactional
    public void saveBooks(BookBean theBean){
        elibraryDAO.saveBooks(theBean);
    }
    
    @Override
    @Transactional
    public BookBean updateBooks(String theId) {
        return elibraryDAO.updateBooks(theId);
    }
    
    @Override
    @Transactional
    public void deleteBooks(String theId) {
        elibraryDAO.deleteBooks(theId);
    }
    
    @Override
    @Transactional
    public List<IssueBookBean> getIssuedBook(){
        return elibraryDAO.getIssueBook();
    }
    
    @Override
    @Transactional
    public void saveIssuedBook(IssueBookBean theIssueBookBean){
        elibraryDAO.saveIssueBook(theIssueBookBean);
    }
    
}

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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
 */
@Repository  
public class ElibraryDAOImp implements ElibraryDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    //----------------------Librarian------------------------
    @Override
    public LibrarianBean loginLibrarian(String userEmail){
        
        Session currentSession = sessionFactory.getCurrentSession();
        
        LibrarianBean theBean = null;
        
        Query theQuery = currentSession.createQuery("from LibrarianBean where email='"+userEmail+"'");
        
        List list = theQuery.list();
        
        if(list!=null){
            theBean = (LibrarianBean)list.get(0);
        }
        
        return theBean;
    
    }
    
    @Override
    public List<LibrarianBean> getLibrarain() {
        
        //get current session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //create Query
        Query<LibrarianBean> query = currentSession.createQuery("from LibrarianBean",LibrarianBean.class );
        
        //run the query
        List<LibrarianBean> theLibrarian = query.getResultList();
        
        //return the result
        return theLibrarian;
    }
    
    @Override
    public void saveLibrarian(LibrarianBean theLibrarianBean) {
        
        //get current hibernate session
        Session currSession = sessionFactory.getCurrentSession();
        
        //save the customer---hb
        currSession.saveOrUpdate(theLibrarianBean);
    }
    
    @Override
    public LibrarianBean updateLibrarian(int theId) {
        
        Session currentSession = sessionFactory.getCurrentSession();
        
        LibrarianBean theLibrarian = currentSession.get(LibrarianBean.class, theId);
        
        return theLibrarian;  
    }
    
    @Override
    public void deleteLibrarian(int theId) {
        // gett the current session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //delete object with primary key
        Query theQuery = currentSession.createQuery("delete from LibrarianBean where id=:libraryId");
        theQuery.setParameter("libraryId", theId);
        
        //update/delete soo onn
        theQuery.executeUpdate();
    }
    
    
    //--------------- Book DAO---------------------
    
    @Override
    public List<BookBean> getBooks() {
        
        //get current session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //create Query
        Query<BookBean> query = currentSession.createQuery("from BookBean",BookBean.class);
        
        //run the query
        List<BookBean> book = query.getResultList();
               
        //return the result
        return book;
    }    
    
    @Override
    public void saveBooks(BookBean theBook) {
        
        //get current hibernate session
        Session currSession = sessionFactory.getCurrentSession();
        
        //save the customer---hb
        currSession.saveOrUpdate(theBook);
    }
    
    @Override
    public BookBean updateBooks(String theId) {
        
        Session currentSession = sessionFactory.getCurrentSession();
        
        BookBean theBook = currentSession.get(BookBean.class, theId);
        
        return theBook;  
    }
    
    @Override
    public void deleteBooks(String theId) {
        // gett the current session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //delete object with primary key
        Query theQuery = currentSession.createQuery("delete from BookBean where callNo=:callNo");
        theQuery.setParameter("callNo", theId);
        
        //update/delete soo onn
        theQuery.executeUpdate();
    }

    @Override
    public List<IssueBookBean> getIssueBook() {
        
        //get current session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //create Query
        Query<IssueBookBean> query = currentSession.createQuery("from IssueBookBean",IssueBookBean.class);
        
        //run the query
        List<IssueBookBean> issueBook = query.getResultList();
               
        //return the result
        return issueBook;
    }
    
    @Override
    public void saveIssueBook(IssueBookBean theIssueBookBean) {
        
        //get current hibernate session
        Session currSession = sessionFactory.getCurrentSession();
        
        //save the customer---hb
        currSession.saveOrUpdate(theIssueBookBean);
    }
    
}

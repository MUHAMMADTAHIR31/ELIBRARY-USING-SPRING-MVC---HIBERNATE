package com.elibrary.controller;

import com.elibrary.entity.BookBean;
import com.elibrary.entity.IssueBookBean;
import com.elibrary.service.ElibraryService;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private ElibraryService elibraryService;
    
    
    //--------------librarian Display to Handle Books-----------------
    @RequestMapping(value = "/display")
    public String index(Model theModel){
        return "librarian-display";
    }
    
    @RequestMapping("/viewBook")
    public String listbook(Model theModel) {
        
        //get book  from DAO
        List<BookBean> theBook = elibraryService.getBooks();
        
        //add  the book to model
        theModel.addAttribute("books",theBook);
        
        //value returns
        return "list-book";
    }
        
    @RequestMapping("/AddBookForm")
    public String showFormForAdd(Model theModel){
        
        BookBean theBook = new BookBean();
        
        theModel.addAttribute("books",theBook);
        
        return "add-book-form";
    }
    
    @RequestMapping("/addBook")
    public String saveCustomer(@Valid @ModelAttribute("books") BookBean theBook,BindingResult result, Map<String, Object> model){
        
        if (result.hasErrors()) {
            return "add-book-form";
        }
        
        //save book 
        elibraryService.saveBooks(theBook);
        
        return "redirect:/books/viewBook";
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("cellId") String theId, Model theModel){
        
        BookBean theBook = elibraryService.updateBooks(theId);
        
        theModel.addAttribute("books",theBook);
        
        return "add-book-form";
    }
    
    @GetMapping("/delete")
    public String deletebook(@RequestParam("cellId") String theId){
        
        elibraryService.deleteBooks(theId);
        
        return "redirect:/books/viewBook";
    }
    
    
    // Issued Book Mapping
    @RequestMapping("/ViewIssuedBook")
    public String listIssuedBook(Model theModel) {
        
        //get book  from DAO
        List<IssueBookBean> theBook = elibraryService.getIssuedBook();
        
        //add  the book to model
        theModel.addAttribute("IssudeBook",theBook);
        
        //value returns
        return "view-issued-book";
    }
    
    @RequestMapping("/IssueBookForm")
    public String showFormForIssueBook(Model theModel){
        
        IssueBookBean theIssueBook = new IssueBookBean();
        
        theModel.addAttribute("issueBook",theIssueBook);
        
        return "issue-book-form";
    }
    
    @RequestMapping("/IssueBook")
    public String saveIssuedBooks(@Valid @ModelAttribute("issueBook") IssueBookBean theIssueBookBean,BindingResult result, Map<String, Object> model){
        
        if (result.hasErrors()) {
            return "issue-book-form";
        }
        
        //save Issuedbook 
        elibraryService.saveIssuedBook(theIssueBookBean);
        
        return "redirect:/books/ViewIssuedBook";
    }
    
    
    //----PDF File Generator------
    @GetMapping("/pdf")
    public ModelAndView exportToPdf() {
        
        ModelAndView mav = new ModelAndView();
        mav.setView(new InvoiceDataPdfExport());
        
        //read data from DB
        List<BookBean> list= elibraryService.getBooks();
        
        //send to pdfImpl class
        mav.addObject("list", list);
        
        return mav; 
    }
}

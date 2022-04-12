package com.elibrary.controller;

import com.elibrary.entity.LibrarianBean;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/librarian")
public class LibrarianController {

    @Autowired
    private ElibraryService elibraryService;
    
    @RequestMapping(value = "/index")
    public String index(Model theModel){
        
        LibrarianBean thelibrary = new LibrarianBean();
        
        theModel.addAttribute("library",thelibrary);
        
        return "index";
    }
        
            
    @RequestMapping("/adminLogin")
    public String adminLogin(Model model, @ModelAttribute("library") LibrarianBean loginBean) {
        
        if (loginBean != null && loginBean.getEmail() != null & loginBean.getPassword() != null) {
            if (loginBean.getEmail().equals("admin@gmail.com") && loginBean.getPassword().equals("12345")) {
                model.addAttribute("msg", loginBean.getEmail());
                return "admin-login";
            } else {
            return "index";
            }
        } else 
        return "index";
    }
   
    @PostMapping("/librarianLogin")
    public String librarianLogin(Model model, @ModelAttribute("library") LibrarianBean loginBean) {
        
        if (loginBean != null && loginBean.getEmail() != null & loginBean.getPassword() != null) {
            if (loginBean.getEmail().equals("admin@gmail.com") && loginBean.getPassword().equals("12345")) {
                model.addAttribute("library", loginBean.getEmail());
                return "redirect:/books/display";
            } else {
            return "librarian-login-form";
            }
        } else 
        return "librarian-login-form";
    }
    
    /* 
    @RequestMapping("/librarianLogin")
    public String librarianLogin(@ModelAttribute ("library") LibrarianBean theLibrarian, Model model) {
        
        String password = theLibrarian.getPassword();
        String userName = theLibrarian.getEmail();
        
        if (password != null && userName != null) {
                LibrarianBean librarianBean = elibraryService.loginLibrarian(userName);
            
            if (librarianBean != null && librarianBean.getEmail().trim().equals(userName)
                    && librarianBean.getPassword().trim().equals(password)) {
                
                model.addAttribute("library",librarianBean);
                return "librarian-display";
            }else{
                model.addAttribute("library", "Invalid Credentials");
                return "librarian-login-form";
            }
        }else{    
            model.addAttribute("library", "Invalid Credentials");
            return "librarian-login-form";
        }
    }*/
    
    @RequestMapping(value = "/showAddLibrarain")
    public String showAddLibrarain(Model theModel){
        
        LibrarianBean thelibrary = new LibrarianBean();
        
        theModel.addAttribute("Librarian",thelibrary);
        
        return "AddLibrarianForm";
    }
    
   
    @RequestMapping("/showLibrarian")
    public String showLibrarian(Model theModel) {
        
        //get Librarian from DAO
        List<LibrarianBean> theLibrarian = elibraryService.getLibrarian();
        
        //add  the Librarian to model
        theModel.addAttribute("Librarian",theLibrarian);
        
        //value returns
        return "ViewLibrarian";
    }
    
    @RequestMapping("/saveLibrarian")
    public String saveCustomer(@Valid @ModelAttribute("Librarian") LibrarianBean theLibrarianBean,BindingResult result, Map<String, Object> model){
        
        if (result.hasErrors()) {
            return "AddLibrarianForm";
        }
        
        //save Librarian
        elibraryService.saveLibrarian(theLibrarianBean);
        
        return "redirect:/librarian/showLibrarian";
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("librarianId") int theId, Model theModel){
        
        LibrarianBean theLibrarian =elibraryService.updateLibrarian(theId);
        
        theModel.addAttribute("Librarian",theLibrarian);
        
        return "AddLibrarianForm";
    }
    
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("librarianId") int theId){
        
        elibraryService.deleteLibrarian(theId);
        
        return "redirect:/librarian/showLibrarian";
    }
      
    ///------PDF Generator----
    @GetMapping("/pdf")
    public ModelAndView exportToPdf() {
        
        ModelAndView mav = new ModelAndView();
        mav.setView(new InvoiceDataPdfExport());
        
        //read data from DB
        List<LibrarianBean> list= elibraryService.getLibrarian();
        
        //send to pdfImpl class
        mav.addObject("list", list);
        return mav; 
    }
    
    
    // Sending Controll for Book 
    @GetMapping("/controllBook")
    public String controllBook(){
        return "redirect:/books/viewBook";
    }
    
}

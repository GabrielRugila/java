package com.ls.gradesproj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotesController {
    
    @GetMapping("/notes")
    public String getNotes(Model model) {
        Note note = new Note();
        model.addAttribute("note", note);
        return "notes";
    }
}

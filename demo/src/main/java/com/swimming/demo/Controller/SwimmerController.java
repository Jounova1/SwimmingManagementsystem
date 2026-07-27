package com.swimming.demo.Controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swimming.demo.Service.SwimmerService;
import com.swimming.demo.entity.Swimmer;

@RestController
@RequestMapping("/api/swimmer")
public class SwimmerController {
    
    private SwimmerService swimmerservice;

    public SwimmerController( SwimmerService swimmerservice)
    {
        this.swimmerservice=swimmerservice;
    }

        @GetMapping("/{id}")
    public String profile( @PathVariable int id, Model model) {

        Swimmer swimmer =swimmerservice.findbyId(id);

        model.addAttribute("swimmer", swimmer);
        
        return "swimmer-profile";
    }

}

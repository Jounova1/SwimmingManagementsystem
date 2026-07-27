package com.swimming.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.swimming.demo.Service.CoachService;
import com.swimming.demo.Service.SwimmerService;
import com.swimming.demo.entity.Swimmer;

@Controller
@RequestMapping("/api/coach")
public class CoachController {

    private SwimmerService swimmerService;
    private CoachService coachService;


    public CoachController(CoachService coachService,SwimmerService swimmerService) {

        this.coachService = coachService;
        this.swimmerService = swimmerService;
    }


    @PostMapping("/createSwimmer")
    public String createSwimmer(@ModelAttribute Swimmer swimmer) {

        swimmerService.create(swimmer);

        return "redirect:/coach/swimmers";
    }

    @GetMapping("/editSwimmer/{id}")
    public String editSwimmer(@PathVariable int id,Model model) {

        Swimmer swimmer =swimmerService.findbyId(id);

        model.addAttribute("swimmer", swimmer);

        return "edit-swimmer";
    }

    @PostMapping("/updateSwimmer")
    public String updateSwimmer(@ModelAttribute Swimmer swimmer) {

        swimmerService.update(swimmer);

        return "redirect:/coach/swimmers";
    }

    @GetMapping("/deleteSwimmer/{id}")
    public String deleteSwimmer(  @PathVariable int id) {

        swimmerService.delete(id);

        return "redirect:/coach/swimmers";
    }
}
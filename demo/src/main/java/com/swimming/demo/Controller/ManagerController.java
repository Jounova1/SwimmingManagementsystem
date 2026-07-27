package com.swimming.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swimming.demo.Service.CoachService;
import com.swimming.demo.Service.SwimmerService;

@Controller
@RequestMapping("/api/manager")
public class ManagerController {
    
    private SwimmerService swimmerService;

    private CoachService coachService;

    public ManagerController(CoachService coachService,SwimmerService swimmerService) {

        this.coachService = coachService;
        this.swimmerService = swimmerService;
    }

    
}

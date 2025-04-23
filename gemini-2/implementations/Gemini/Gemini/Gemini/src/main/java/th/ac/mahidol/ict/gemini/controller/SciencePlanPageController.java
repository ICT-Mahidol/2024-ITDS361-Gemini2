package th.ac.mahidol.ict.gemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import th.ac.mahidol.ict.gemini.model.SciencePlanDTO;
import th.ac.mahidol.ict.gemini.service.SciencePlanService;

@Controller
@RequestMapping("/scienceplans")
public class SciencePlanPageController {
    @Autowired
    private SciencePlanService service;

    @GetMapping("/create")
    public String showCreateSciencePlanForm(Model model) {
        model.addAttribute("sciencePlan", new SciencePlanDTO());
        return "createScienceplan";
    }

    @PostMapping(consumes = "application/json", produces = "text/plain")
    @ResponseBody
    public String createSciencePlanJson(@RequestBody SciencePlanDTO dto) {
        return service.createSciencePlanFromDTO(dto);
    }

}

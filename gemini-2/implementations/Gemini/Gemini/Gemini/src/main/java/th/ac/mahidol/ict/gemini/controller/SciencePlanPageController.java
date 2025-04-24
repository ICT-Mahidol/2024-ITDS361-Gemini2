package th.ac.mahidol.ict.gemini.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
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

    @PostMapping("/{id}/test")
    public String testSciencePlan(@PathVariable int id, Model model) {
        OCS ocs = new OCS();
        SciencePlan plan = ocs.getSciencePlanByNo(id);

        if (plan == null) {
            model.addAttribute("error", "Science Plan not found.");
            return "error"; // แสดง error.html
        }

        ocs.updateSciencePlanStatus(id, SciencePlan.STATUS.TESTED);
        model.addAttribute("message", "Science Plan " + id + " is now marked as TESTED.");
        model.addAttribute("sciencePlan", plan);

        return "testScienceplan"; //
    }

    @GetMapping("/lists")
    public String showAllSciencePlan() {
        return "scienceplan_list";
    }
}

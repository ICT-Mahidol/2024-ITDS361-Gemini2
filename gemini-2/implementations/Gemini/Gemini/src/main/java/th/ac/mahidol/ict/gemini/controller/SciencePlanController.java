package th.ac.mahidol.ict.gemini.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.mahidol.ict.gemini.model.SciencePlanDTO;
import th.ac.mahidol.ict.gemini.repository.SciencePlanRepository;
import th.ac.mahidol.ict.gemini.service.SciencePlanService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/scienceplans")
public class SciencePlanController {

    @Autowired
    private SciencePlanService service;

    @PostMapping
    public String createSciencePlan(@RequestBody SciencePlanDTO dto) {
        return service.createSciencePlanFromDTO(dto);
    }


    @Autowired
    private SciencePlanService sciencePlanService;

    @GetMapping
//    public List<edu.gemini.app.ocs.model.SciencePlan> getAllSciencePlans() {
//        List<edu.gemini.app.ocs.model.SciencePlan> plans = sciencePlanService.getAllSciencePlans();
//        System.out.println("Science Plans from service: " + plans); // แสดงข้อมูลที่ดึงมา
//        return plans;
//    }

    public ArrayList<SciencePlan> getAllSciencePlans() {
        OCS o = new OCS();
        System.out.println(o.getAllSciencePlans());
        return o.getAllSciencePlans();
    }
//    @GetMapping("/sciencePlans/{id}")
//    public SciencePlan getSciencePlanById(@PathVariable Long id) {
//        return sciencePlanService.getSciencePlanById(id); // ส่งข้อมูลตาม id
//    }

}


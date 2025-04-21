package th.ac.mahidol.ict.gemini.service;

import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.beans.factory.annotation.Autowired;
import th.ac.mahidol.ict.gemini.model.SciencePlanDTO;
import th.ac.mahidol.ict.gemini.repository.OCSRepository;
import edu.gemini.app.ocs.model.StarSystem;
import edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC;
import org.springframework.stereotype.Service;
import th.ac.mahidol.ict.gemini.repository.SciencePlanRepository;

import java.text.SimpleDateFormat;
import java.util.List;
//import th.ac.mahidol.ict.gemini.model.SciencePlan as LocalSciencePlan;
import th.ac.mahidol.ict.gemini.mapper.SciencePlanMapper;


@Service
public class SciencePlanService {

    @Autowired
    private OCSRepository ocsRepository; // ใช้ @Autowired สำหรับ OCSRepository

    @Autowired
    private SciencePlanRepository sciencePlanRepository; // ใช้ @Autowired สำหรับ SciencePlanRepository

    public String createSciencePlanFromDTO(SciencePlanDTO dto) {
        try {
            // สร้าง instance ของ SciencePlan จาก edu.gemini.app.ocs.model
            edu.gemini.app.ocs.model.SciencePlan sp = new edu.gemini.app.ocs.model.SciencePlan(
                    dto.creator,  // creator
                    dto.submitter, // submitter (เพิ่มข้อมูลใน DTO)
                    dto.fundingInUSD,  // fundingInUSD
                    dto.objectives,  // objectives
                    StarSystem.CONSTELLATIONS.valueOf(dto.starSystem), // starSystem
                    new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(dto.startDate), // startDate
                    new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(dto.endDate), // endDate
                    TELESCOPELOC.valueOf(dto.telescopeLocation), // telescopeLocation
                    new DataProcRequirement(  // dataProcRequirements
                            dto.dataProcRequirement.fileType,
                            dto.dataProcRequirement.fileQuality,
                            dto.dataProcRequirement.colorType,
                            dto.dataProcRequirement.contrast,
                            dto.dataProcRequirement.brightness,
                            dto.dataProcRequirement.saturation,
                            dto.dataProcRequirement.highlights,
                            dto.dataProcRequirement.exposure,
                            dto.dataProcRequirement.shadows,
                            dto.dataProcRequirement.whites,
                            dto.dataProcRequirement.blacks,
                            dto.dataProcRequirement.luminance,
                            dto.dataProcRequirement.hue
                    )
            );

            // บันทึก SciencePlan ผ่าน ocsRepository
            return ocsRepository.saveSciencePlan(sp); // บันทึกข้อมูล science plan

        } catch (Exception e) {
            return "Error creating science plan: " + e.getMessage();
        }
    }


    public List<edu.gemini.app.ocs.model.SciencePlan> getAllSciencePlans() {
        List<th.ac.mahidol.ict.gemini.model.SciencePlan> localPlans = sciencePlanRepository.findAll();
        System.out.println("Local Plans: " + localPlans); // แสดงข้อมูลที่ดึงมา
        List<edu.gemini.app.ocs.model.SciencePlan> ocsPlans = SciencePlanMapper.mapToOCSList(localPlans);
        System.out.println("Mapped OCS Plans: " + ocsPlans); // แสดงข้อมูลหลังการแปลง
        return ocsPlans;
    }



}

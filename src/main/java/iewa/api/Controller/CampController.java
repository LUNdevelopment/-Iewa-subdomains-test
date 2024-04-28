package iewa.api.Controller;


import iewa.api.DTO.Camp.RegisterCampDTO;
import iewa.api.Service.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/camp")
public class CampController {



    @Autowired
    private CampService campService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody  RegisterCampDTO registerCampDTO) {
        try {
            return campService.register(registerCampDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

}
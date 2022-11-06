package webApi.Controllers;

import business.abstracts.PhoneService;
import entities.concretes.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/phone/api")
public class PhoneControllers {

    public PhoneService phoneService;

    @Autowired
    public PhoneControllers(PhoneService phoneService) {
        this.phoneService = phoneService;
    }
    @GetMapping(name = "/getAll")
    public List<Phone> getAll(){
        return this.phoneService.getAll();
    }
    @PostMapping(name = "/add")
    public void add(Phone phone){
        this.phoneService.add(phone);
    }
    @DeleteMapping
    public void delete(Phone phone){
        this.phoneService.delete(phone);
    }
    @PutMapping
    public void update(Phone phone, int id){
        this.phoneService.update(phone,id);
    }

}

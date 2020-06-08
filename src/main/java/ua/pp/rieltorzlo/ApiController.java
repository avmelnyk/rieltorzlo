package ua.pp.rieltorzlo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String homePage(){
        return "Hello! This is Rieltorzlo start page!";
    }

    @GetMapping("/adds")
    public String getAdds(){
        return "This is test Addvertisment";
    }


}

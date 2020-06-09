package ua.pp.rieltorzlo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pp.rieltorzlo.models.Add;
import ua.pp.rieltorzlo.models.AddRepository;

import java.util.List;


@RestController
public class ApiController {

    @Autowired
    AddRepository repository;
    @GetMapping("/")
    public String homePage(){
        return "Hello! This is Rieltorzlo start page!";
    }

    @GetMapping("/adds")
    public List<Add> getAdds(){
        return (List<Add>) repository.findAll();
    }
}

package ua.pp.rieltorzlo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import ua.pp.rieltorzlo.models.AddRepository;

@SpringBootApplication
public class RieltorzloApp {
    public static void main(String[] args) {
        SpringApplication.run(RieltorzloApp.class, args);
    }

    @Autowired
    private AddRepository addRepository;


}

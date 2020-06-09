package ua.pp.rieltorzlo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import ua.pp.rieltorzlo.models.AddRepository;



@SpringBootApplication
public class RieltorzloApp  {

    private static final Logger log = LoggerFactory.getLogger(RieltorzloApp.class);
    public static void main(String[] args) {
        SpringApplication.run(RieltorzloApp.class, args);
    }

    @Autowired
    AddRepository addRepository;

}

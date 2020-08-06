package ua.pp.rieltorzlo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import ua.pp.rieltorzlo.models.Ad;
import ua.pp.rieltorzlo.models.AddRepository;
import ua.pp.rieltorzlo.models.User;
import ua.pp.rieltorzlo.models.UserRepository;


@SpringBootApplication
public class RieltorzloApp  {

    private static final Logger log = LoggerFactory.getLogger(RieltorzloApp.class);
    public static void main(String[] args) {
        SpringApplication.run(RieltorzloApp.class, args);
    }

    @Autowired
    AddRepository addRepository;

    @Bean
    public CommandLineRunner runner(UserRepository userRepository, AddRepository addRepository){
        
        return args -> {
            User user = new User("Andrii", "Melnyk", "+380635555555","email@avmelnyk.pp.ua" );
            userRepository.save(user);

            Ad ad = new Ad("Header","Description",user);

            addRepository.save(ad);
            addRepository.findAll().forEach(add->{
                System.out.println(add.toString());
            });
            userRepository.findAll().forEach(u->{
                System.out.println(u.toString());
            });
        };
    }

}

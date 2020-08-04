package ua.pp.rieltorzlo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.pp.rieltorzlo.models.Ad;
import ua.pp.rieltorzlo.models.AddRepository;
import ua.pp.rieltorzlo.models.User;
import ua.pp.rieltorzlo.models.UserRepository;

import java.util.List;
import java.util.Optional;


@RestController
public class ApiController {

    @Autowired
    AddRepository repository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String homePage(){
        return "Hello! This is Rieltorzlo start page!";
    }

    @GetMapping("/ads")
    public List<Ad> getAds(){
        return (List<Ad>) repository.findAll();
    }

    @GetMapping("/ads/{id}")
    public Optional<Ad> getAdById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @PatchMapping("/ads/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Ad updateAd(@RequestBody Ad ad){
        return  repository.save(ad);
    }

    @PostMapping("/ads")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createAd(@RequestBody Ad ad){
        return repository.save(ad).getId();
    }

    @DeleteMapping("/ads/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Long deleteAd(@PathVariable("id") Long  id){
        repository.deleteById(id);
        return id;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createUser(@RequestBody User user){
        return userRepository.save(user).getId();
    }


    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }

}

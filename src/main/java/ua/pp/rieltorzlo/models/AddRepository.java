package ua.pp.rieltorzlo.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddRepository extends CrudRepository<Ad, Long> {
    List<Ad>findAllByAuthor(String author);
    Ad findById(long id);
}

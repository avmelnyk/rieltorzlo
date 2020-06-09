package ua.pp.rieltorzlo.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddRepository extends CrudRepository<Add, Long> {
    List<Add>findAllByAuthor(String author);
    Add findById(long id);
}

package ua.pp.rieltorzlo.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddRepository extends CrudRepository<Ad, Long> {
    List<Ad>findAdByAuthorId(Long authorid);
    Ad findById(long id);
}

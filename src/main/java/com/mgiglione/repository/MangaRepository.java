package com.mgiglione.repository;

import java.util.List;

import com.mgiglione.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {

    List<Manga> findByTitleContainingIgnoreCase(String title);

    /*List<Customer> findByLastName(String lastName);
    Customer findById(long id);*/
}


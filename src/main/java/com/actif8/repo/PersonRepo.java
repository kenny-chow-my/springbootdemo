package com.actif8.repo;

import com.actif8.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kenny on 4/8/2017.
 */

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}

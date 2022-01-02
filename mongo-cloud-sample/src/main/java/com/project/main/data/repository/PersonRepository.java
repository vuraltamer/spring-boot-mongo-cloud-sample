package com.project.main.data.repository;

import com.project.main.data.document.Person;
import com.project.main.data.repository.base.BaseRepository;

import java.util.List;

public interface PersonRepository extends BaseRepository<Person, Integer> {

    List<Person> findPersonByUsername(String userName);

}

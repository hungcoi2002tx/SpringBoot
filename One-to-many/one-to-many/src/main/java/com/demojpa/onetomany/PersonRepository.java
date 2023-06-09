package com.demojpa.onetomany;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
    public List<Person> findByFirstName(String firstName);
    public List<Person> findByFirstNameContaining(String firstName);

    @Query("SELECT p from Person p where p.firstName like ?1 or p.lastName like ?1")
    public List<Person> findByFirstNameOrLastNameContaining(String keyword);



}

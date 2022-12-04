package com.example.service1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactBookRepository extends CrudRepository<Contacts, String> {
}

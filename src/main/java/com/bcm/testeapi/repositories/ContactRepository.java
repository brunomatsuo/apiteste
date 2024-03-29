package com.bcm.testeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcm.testeapi.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}

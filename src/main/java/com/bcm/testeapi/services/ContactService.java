package com.bcm.testeapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcm.testeapi.models.Contact;
import com.bcm.testeapi.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public Optional<Contact> findById(Long id) {
		return contactRepository.findById(id);
	}
	
	public List<Contact> findAll() {
		return contactRepository.findAll();
	}
	
	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public void deleteById(long id) {
		contactRepository.deleteById(id);
	}
	
	public void deleteAll() {
		contactRepository.deleteAll();
	}

}

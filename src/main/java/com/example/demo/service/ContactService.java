package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Contact;

public interface ContactService extends JpaRepository<Contact, Long>{

}

package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}

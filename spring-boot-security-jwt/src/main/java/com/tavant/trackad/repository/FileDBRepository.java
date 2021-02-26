package com.tavant.trackad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tavant.trackad.models.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}

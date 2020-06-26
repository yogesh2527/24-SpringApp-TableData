package com.assimilate.table.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.table.model.SendMail;

@Repository
public interface SendEmailRepository extends JpaRepository<SendMail, Integer> {

}

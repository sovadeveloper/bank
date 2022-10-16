package com.sovadeveloper.bankService.repository;

import com.sovadeveloper.bankService.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
    Page<Client> findAll(Pageable pageable);
}

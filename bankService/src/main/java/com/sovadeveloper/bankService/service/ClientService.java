package com.sovadeveloper.bankService.service;

import com.sovadeveloper.bankService.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {
    Page<Client> getAll(Pageable pageable);

    Long delete(Long id);
}

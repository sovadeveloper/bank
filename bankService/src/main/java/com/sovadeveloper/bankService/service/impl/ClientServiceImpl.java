package com.sovadeveloper.bankService.service.impl;

import com.sovadeveloper.bankService.entity.Client;
import com.sovadeveloper.bankService.repository.ClientRepo;
import com.sovadeveloper.bankService.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;

    @Autowired
    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Page<Client> getAll(Pageable pageable) {
        return clientRepo.findAll(pageable);
    }
}

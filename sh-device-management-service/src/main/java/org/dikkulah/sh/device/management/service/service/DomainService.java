package org.dikkulah.sh.device.management.service.service;

import org.dikkulah.sh.device.management.service.repository.DomainRepository;
import org.springframework.stereotype.Service;

@Service
public class DomainService {
    private final DomainRepository domainRepository;

    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

}

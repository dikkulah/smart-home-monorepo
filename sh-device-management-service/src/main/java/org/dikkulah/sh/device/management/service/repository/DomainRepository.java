package org.dikkulah.sh.device.management.service.repository;

import org.dikkulah.sh.device.management.service.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Long> {
}

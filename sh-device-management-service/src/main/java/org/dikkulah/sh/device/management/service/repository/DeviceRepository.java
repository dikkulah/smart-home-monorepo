package org.dikkulah.sh.device.management.service.repository;

import org.dikkulah.sh.device.management.service.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}

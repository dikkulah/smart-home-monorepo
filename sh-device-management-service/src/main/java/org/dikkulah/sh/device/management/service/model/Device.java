package org.dikkulah.sh.device.management.service.model;

import jakarta.persistence.*;
import org.dikkulah.sh.device.management.service.model.enums.DeviceCategory;
import org.dikkulah.sh.device.management.service.model.enums.DeviceStatus;
import org.dikkulah.sh.device.management.service.model.enums.DeviceType;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private DeviceCategory category;
    private DeviceType type;
    private DeviceStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Domain domain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceCategory getCategory() {
        return category;
    }

    public void setCategory(DeviceCategory category) {
        this.category = category;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }
}

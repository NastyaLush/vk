package com.example.vkk.auditing;

import com.example.vkk.auditing.entity.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditService {
    private final AuditRepository auditRepository;

    @Autowired
    public AuditService(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    public void create(Audit audit) {
        auditRepository.save(audit);
    }
}

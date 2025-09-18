package com.youpackage;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;

    private String entityName;
    private Long entityId;
    private String action;
    private LocalDateTime performedAt;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    public AuditLog() {
    }

    public AuditLog(String entityName, Long entityId, String action, LocalDateTime performedAt,
            FinancialAdvisor advisor) {
        this.entityName = entityName;
        this.entityId = entityId;
        this.action = action;
        this.performedAt = performedAt;
        this.advisor = advisor;
    }

    // Getters and setters
    // ...
}

package com.youpackage;

import jakarta.persistence.*;
import jmain.java.com.youpackage

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<AdvisorAvailability> availabilities;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<AuditLog> auditLogs;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters
    // ...
}
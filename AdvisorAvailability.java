package com.youpackage;

import jakarta.persistence.*;

@Entity
public class AdvisorAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availabilityId;

    private String weekday;
    private String startTime;
    private String endTime;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    public AdvisorAvailability() {
    }

    public AdvisorAvailability(String weekday, String startTime, String endTime, FinancialAdvisor advisor) {
        this.weekday = weekday;
        this.startTime = startTime;
        this.endTime = endTime;
        this.advisor = advisor;
    }

    // Getters and setters
    // ...
}

package com.Loan.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Reference {
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nextOfKinName;
    private String nextOfKinAddress;

}

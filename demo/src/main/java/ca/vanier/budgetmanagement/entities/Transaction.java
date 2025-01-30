package ca.vanier.budgetmanagement.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
    //@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String type; //either income or expense
    private LocalDateTime date;

    @ManyToOne
    private BudgetCategory category;
    
}

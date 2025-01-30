package com.yourspresently.pojos;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "giftwrappingoptions", schema = "project_giftshop")
public class GiftWrappingOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer optionID;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;
}
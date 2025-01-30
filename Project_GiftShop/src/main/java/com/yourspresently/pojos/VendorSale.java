package com.yourspresently.pojos;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vendorsales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer saleID;

    @ManyToOne
    @JoinColumn(name = "vendorID", nullable = false)
    private Long vendorID;

    @ManyToOne
    @JoinColumn(name = "orderID", nullable = false)
    private Long orderID;

    @ManyToOne
    @JoinColumn(name = "productID", nullable = false)
    private Long productID;

    private Integer quantitySold;
    private double saleAmount;
    private Timestamp saleDate;
}
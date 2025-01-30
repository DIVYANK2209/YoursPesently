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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shippingdetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shippingID;

    @OneToOne
    @JoinColumn(name = "orderID", nullable = false)
    private Long orderID;

    private String shippingAddress;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private ShippingMethod shippingMethod;
    private double shippingCost;
}

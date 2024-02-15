package by.itacademy.addresses.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "COMPANY_NAME", nullable = false)
    private String companyName;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STREET")
    private String streetName;

    @Column(name = "HOUSE_NUMBER")
    private Integer houseNumber;
}

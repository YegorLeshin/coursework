package ru.courseworkdt.elib.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "licenses")
@NoArgsConstructor
@AllArgsConstructor
public class License {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_license")
    private String type;

    @Column(name = "price")
    private double price;
}
